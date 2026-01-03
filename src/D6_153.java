public class D6_153 {
    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;     // min nằm bên phải
            } else {
                right = mid;        // min nằm bên trái hoặc chính mid
            }
        }

        return nums[left];
    }
}
