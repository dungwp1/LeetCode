import java.util.Stack;

public class D40_84 {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i <= heights.length; i++) {
            int iHeight = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && iHeight < heights[stack.peek()]) {
                int current = stack.pop();
                int left = (!stack.isEmpty()) ? stack.peek() : -1;
                int right = i;
                int area = heights[current] * (right - left - 1);
                result = Math.max(area, result);
            }
            stack.push(i);
        }
        return result;
    }
}
