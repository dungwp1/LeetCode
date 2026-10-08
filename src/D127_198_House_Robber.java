import java.util.Arrays;

public class D127_198_House_Robber {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return maxMoney(nums, 0, memo);
    }

    private int maxMoney(int[] nums, int start, int[] memo) {
        if (start >= nums.length) return 0;
        if (memo[start] != -1) return memo[start];

        int currentRobber = nums[start] + maxMoney(nums, start + 2, memo);
        int skipRobber = maxMoney(nums, start + 1, memo);
        memo[start] = Math.max(currentRobber, skipRobber);
        return memo[start];
    }
}
