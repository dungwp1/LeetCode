public class D134_1021_Remove_Outermost_Parentheses {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) sb.append(c);
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) sb.append(c);
            }
        }
        return sb.toString();
    }
}
