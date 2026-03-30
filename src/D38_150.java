import java.util.Stack;

public class D38_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String i : tokens) {
            if (i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                switch (i) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}
