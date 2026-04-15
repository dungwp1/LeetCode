import java.util.HashMap;
import java.util.Map;

public class D61_1590_Make_Sum_Divisible_by_P {
    public int minSubarray(int[] nums, int p) {
        int minSubarray = nums.length;
        long sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if ((int) (sum % p) == 0) return 0;
        long currentSum = 0;
        int targetRem = (int) (sum % p);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int currentRem = (int) (currentSum % p);
            int needRem = (currentRem - targetRem + p) % p;
            if (map.containsKey(needRem)) {
                minSubarray = Math.min(minSubarray, i - map.get(needRem));
            }
            map.put(currentRem, i);
        }
        return (minSubarray >= nums.length) ? -1 : minSubarray;
    }
}
