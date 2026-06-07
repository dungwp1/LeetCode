import java.util.Arrays;

public class D79_16_3Sum_Closest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) return target;
                if (Math.abs(sum - target) < Math.abs(closetSum - target)) {
                    closetSum = sum;
                }
                if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return closetSum;
    }
}
