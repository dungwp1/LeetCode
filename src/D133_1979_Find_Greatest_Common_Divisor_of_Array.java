public class D133_1979_Find_Greatest_Common_Divisor_of_Array {
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }
        int result = 1;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) result = i;
        }
        return result;
    }
}
