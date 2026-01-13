import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class D22_496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i : nums2) {
            while (!stack.isEmpty() && i > stack.peek()) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
