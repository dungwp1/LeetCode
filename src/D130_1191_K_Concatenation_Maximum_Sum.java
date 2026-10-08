public class D130_1191_K_Concatenation_Maximum_Sum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long max = 0;
        int MOD = 1_000_000_007;
        int n = arr.length;
        long sumAll = 0;
        for (int i : arr) sumAll += i;

        int repeat = (k == 1) ? 1 : 2;
        long maxSub = maxSum(arr, repeat);
        if (k == 1 || sumAll <= 0) {
            return (int) (maxSub % MOD);
        }
        long result = maxSub + (long) (k - 2) * sumAll;

        return (int) (result % MOD);
    }

    private long maxSum(int[] arr, int repeat) {
        long maxAll = 0;
        long maxCurrent = 0;
        for (int r = 0; r < repeat; r++) {
            for (int num : arr) {
                maxCurrent = Math.max(num, maxCurrent + num);
                if (maxAll < maxCurrent) maxAll = maxCurrent;
            }
        }
        return maxAll;
    }
}
