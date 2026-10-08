import java.util.Arrays;

public class D126_494_Target_Sum {
    public int findTargetSumWays(int[] nums, int target) {
        int sumAll = 0;
        for (int num : nums) sumAll += num;
        int[][] memo = new int[nums.length][2 * sumAll + 1];
        for (int[] row : memo) Arrays.fill(row, -1);
        return findsubWay(nums, memo, 0, target, sumAll);
    }

    private int findsubWay(int[] nums, int[][] memo, int startIndex, int target, int sumAll) {
        if (startIndex == nums.length) {
            return (target == 0) ? 1 : 0;
        }
        if (Math.abs(target) > sumAll) return 0;
        int memoIndex = target + sumAll;
        if (memo[startIndex][memoIndex] != -1) {
            return memo[startIndex][memoIndex];
        }
        int subTarget1 = target - nums[startIndex];
        int subTarget2 = target + nums[startIndex];
        int totalWays = findsubWay(nums, memo, startIndex + 1, subTarget1, sumAll)
                + findsubWay(nums, memo, startIndex + 1, subTarget2, sumAll);
        memo[startIndex][memoIndex] = totalWays;
        return totalWays;
    }
}
