import java.util.HashMap;
import java.util.Map;

public class D13_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> mapNum = new HashMap<>();
        for (int num : nums) {
            if (mapNum.containsKey(num)) {
                mapNum.put(num, mapNum.get(num) + 1);
            } else {
                mapNum.put(num, 1);
            }
        }
        int candidate = nums[0];
        int count = 0;
        for (int i : mapNum.keySet()) {
            if (mapNum.get(i) > count) {
                count = mapNum.get(i);
                candidate = i;
            }
        }
        return candidate;
    }
}
