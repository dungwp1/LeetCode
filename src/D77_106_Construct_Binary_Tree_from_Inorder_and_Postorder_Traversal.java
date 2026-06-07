import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D77_106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int indexRoot = map.get(root.val);
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, indexRoot);
        int[] postorderLeft = Arrays.copyOfRange(postorder, 0, indexRoot);
        int[] inorderRight = Arrays.copyOfRange(inorder, indexRoot + 1, inorder.length);
        int[] postorderRight = Arrays.copyOfRange(postorder, indexRoot, postorder.length - 1);
        root.left = buildTree(inorderLeft, postorderLeft);
        root.right = buildTree(inorderRight, postorderRight);
        return root;
    }
}
