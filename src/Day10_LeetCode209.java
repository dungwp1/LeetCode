public class Day10_LeetCode209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0;
        int length = 0;
        int minLength = Integer.MAX_VALUE;
        while (true) {
            if (sum >= target) {
                length = right - left;
                minLength = Math.min(length, minLength);
                sum -= nums[left];
                left++;
            } else {
                if (right == nums.length) break;
                sum += nums[right];
                right++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
