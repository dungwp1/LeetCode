import java.util.Arrays;

public class D73_Build_Merge_Sort {
    public static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) return nums;
        int mid = nums.length / 2;
        int[] numsLeft = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] numsRight = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(numsLeft, numsRight);
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
