import java.util.Arrays;

public class D72_493_Reverse_Pairs {
    public static int reversePairs(int[] nums) {
        int count = 0;
        solve(nums, count);
        return count;
    }

    private static int[] solve(int[] nums, int count) {
        if (nums.length <= 1) return nums;
        int mid = nums.length / 2;
        int[] numsLeft = solve(Arrays.copyOfRange(nums, 0, mid), count);
        int[] numsRight = solve(Arrays.copyOfRange(nums, mid, nums.length), count);
        count += compare(numsLeft, numsRight);
        return merge(numsLeft, numsRight);
    }

    private static int compare(int[] numsLeft, int[] numsRight) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < numsLeft.length; i++) {
            while (j < numsRight.length && (long) numsLeft[i] > 2 * (long) numsRight[j]) {
                j++;
            }
            count += j;
        }
        return count;
    }

    private static int[] merge(int[] numsLeft, int[] numsRight) {
        int[] result = new int[numsLeft.length + numsRight.length];
        int i = 0, j = 0, k = 0;
        while (i < numsLeft.length && j < numsRight.length) {
            if (numsLeft[i] <= numsRight[j]) {
                result[k] = numsLeft[i];
                i++;
            } else {
                result[k] = numsRight[j];
                j++;
            }
            k++;
        }
        while (j < numsRight.length) {
            result[k] = numsRight[j];
            j++;
            k++;
        }
        while (i < numsLeft.length) {
            result[k] = numsLeft[i];
            i++;
            k++;
        }
        return result;
    }


}
