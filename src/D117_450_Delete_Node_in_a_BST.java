public class D117_450_Delete_Node_in_a_BST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;

            TreeNode mostLeft = mostLeft(root.right);
            root.val = mostLeft.val;
            root.right = deleteNode(root.right, mostLeft.val);
        }
        return root;
    }

    private TreeNode mostLeft(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


}
