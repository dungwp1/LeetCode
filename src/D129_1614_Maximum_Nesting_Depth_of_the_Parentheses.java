public class D129_1614_Maximum_Nesting_Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                max = Math.max(max, count);
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return max;
    }
}
