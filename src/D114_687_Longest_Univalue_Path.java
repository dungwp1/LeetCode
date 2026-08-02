public class D114_687_Longest_Univalue_Path {
    public int longestUnivaluePath(TreeNode root) {
        int[] result = new int[1];
        dfs(root, result);
        return result[0];
    }

    private int dfs(TreeNode node, int[] result) {
        if (node == null) return 0;
        int leftPath = 0;
        int leftTree = dfs(node.left, result);
        int rightPath = 0;
        int rightTree = dfs(node.right, result);
        if (node.left != null && node.val == node.left.val) leftPath = leftTree + 1;
        if (node.right != null && node.val == node.right.val) rightPath = rightTree + 1;
        result[0] = Math.max(result[0], leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }
}
