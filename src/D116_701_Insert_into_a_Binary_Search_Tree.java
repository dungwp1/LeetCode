public class D116_701_Insert_into_a_Binary_Search_Tree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val > root.val) {
//            Rơi sang nhánh Right
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
