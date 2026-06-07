import java.util.Arrays;

public class D64_1887_Reduction_Operations_to_Make_the_Array_Elements_Equal {
    public int reductionOperations(int[] nums) {
        int min = nums[0];
        int step = 0;
        int count = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == min) {
                count += step;
            } else if (num >= min) {
                min = num;
                step++;
                count += step;
            }
        }
        return count;
    }
}
