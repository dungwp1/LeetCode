import java.util.Stack;

public class D27_1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder newS = new StringBuilder();
        while (!stack.isEmpty()) {
            newS.append(stack.pop());
        }
        return newS.reverse().toString();
    }
}
