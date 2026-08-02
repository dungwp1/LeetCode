public class D112_2236_Root_Equals_Sum_of_Children {
    public boolean checkTree(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        return root.val == left.val + right.val;
    }
}
