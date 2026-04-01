import java.util.Stack;

public class D23_739 {
    public static int[] dailyTemperatures1(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int preIndex = stack.pop();
                result[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return result;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()) {
                if (temperatures[i] > temperatures[stack.peek()]) {
                    int preDay = stack.pop();
                    result[preDay] = i - preDay;
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return result;
    }
}
