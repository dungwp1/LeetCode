import java.util.Stack;

public class D28_844 {
    public static boolean backspaceCompare(String s, String t) {
//        String s1 = cutString1(s);
//        String t1 = cutString1(t);
//        return s1.equals(t1);

//        StringBuilder sb1 = cutString2(s);
//        StringBuilder tb1 = cutString2(t);
//        return sb1.compareTo(tb1) == 0;

        int n = s.length() - 1, m = t.length() - 1;
        while (n >= 0 || m >= 0) {
            n = processIndex(s, n);
            m = processIndex(t, m);
            if (n >= 0 && m >= 0 && s.charAt(n) != t.charAt(m)) return false;
            if ((n >= 0) != (m >= 0)) return false;
            n--;
            m--;
        }
        return true;
    }

    private static String cutString1(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') stack.push(c);
            else {
                if (!stack.isEmpty()) stack.pop();
            }
        }
        StringBuilder newS = new StringBuilder();
        for (char c : stack) {
            newS.append(c);
        }
        return newS.toString();
    }

    private static StringBuilder cutString2(String s) {
        StringBuilder newS = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') count++;
            else if (count > 0) count--;
            else newS.append(s.charAt(i));
        }
        return newS;
    }

    private static int processIndex(String s, int n) {
        int skip = 0;
        while (n >= 0) {
            if (s.charAt(n) == '#') {
                skip++;
                n--;
            } else if (skip > 0) {
                skip--;
                n--;
            } else {
                break;
            }
        }
        return n;
    }


}