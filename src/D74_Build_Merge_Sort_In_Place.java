public class D74_Build_Merge_Sort_In_Place {
    public static int mergeSort(int[] nums) {
        int left = 0, right = nums.length - 1, count = 0;
        return mergeSortInPlace(nums, left, right);
    }

    private static int mergeSortInPlace(int[] nums, int left, int right) {
        if (left >= right) return 0;
        int mid = (right - left) / 2 + left;
        int count = mergeSortInPlace(nums, left, mid) + mergeSortInPlace(nums, mid + 1, right);
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2.0 * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        merge(nums, left, mid, right);
        return count;

    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] newNums = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                newNums[k] = nums[i];
                i++;
            } else {
                newNums[k] = nums[j];
                j++;
            }
            k++;
        }
        while (j <= right) {
            newNums[k] = nums[j];
            j++;
            k++;
        }
        while (i <= mid) {
            newNums[k] = nums[i];
            i++;
            k++;
        }
        int idx = left;
        for (int num : newNums) {
            nums[idx] = num;
            idx++;
        }
    }

}
