public class D32_643 {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length, sum = 0, l = 0;
//        build first subarray
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
//        sliding windows
        int slideSum = sum;
        for (int r = k; r < n; r++) {
            slideSum = slideSum + nums[r] - nums[l];
            sum = Math.max(sum, slideSum);
            l++;
        }
        return (double) sum / k;
    }
}
