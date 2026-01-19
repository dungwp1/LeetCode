import java.util.Stack;

public class D24_1475 {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty()) {
                if (prices[stack.peek()] >= prices[i]) {
                    int preIndex = stack.pop();
                    prices[preIndex] -= prices[i];
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return prices;
    }
}
