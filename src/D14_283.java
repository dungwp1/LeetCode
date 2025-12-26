public class D14_283 {
    public static void moveZeroes(int[] nums) {
        int write = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[write] = nums[i];
                write++;
            }
        }
        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
