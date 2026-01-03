import java.util.Arrays;

public class D3_242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] StringS = s.toCharArray();
            char[] StringT = t.toCharArray();
            Arrays.sort(StringS);
            Arrays.sort(StringT);
            if (Arrays.equals(StringS, StringT)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
