import java.util.Arrays;

public class D118_2940_Find_Building_Where_Alice_and_Bob_Can_Meet {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] tree = new int[heights.length * 4];
        buildTree(tree, heights, 1, 0, heights.length - 1);
        int[] result = new int[queries.length];
        Arrays.fill(result, -1);

        for (int i = 0; i < queries.length; i++) {
            int Alice = queries[i][0];
            int Bob = queries[i][1];

            if (Alice > Bob) {
                int temp = Alice;
                Alice = Bob;
                Bob = temp;
            }
            if (Alice == Bob || heights[Alice] < heights[Bob]) {
                result[i] = Bob;
                continue;
            }
            int maxHeight = Math.max(heights[Alice], heights[Bob]);
            result[i] = findMax(tree, 1, 0, heights.length - 1, Bob + 1, heights.length - 1, maxHeight);

        }
        return result;
    }

    private void buildTree(int[] tree, int[] heights, int current, int start, int end) {
        if (start == end) {
            tree[current] = heights[start];
            return;
        }
        int mid = start + (end - start) / 2;
        int leftCur = 2 * current;
        int rightCur = 2 * current + 1;
        buildTree(tree, heights, leftCur, start, mid);
        buildTree(tree, heights, rightCur, mid + 1, end);
        tree[current] = Math.max(tree[leftCur], tree[rightCur]);

    }

    private int findMax(int[] tree, int current, int start, int end, int left, int right, int target) {
        if (right < start || end < left || tree[current] <= target) return -1;
        if (start == end) return start;
        int mid = start + (end - start) / 2;
        int leftCur = 2 * current;
        int rightCur = 2 * current + 1;
        int leftResult = findMax(tree, leftCur, start, mid, left, right, target);
        if (leftResult != -1) return leftResult;

        return findMax(tree, rightCur, mid + 1, end, left, right, target);
    }
}
