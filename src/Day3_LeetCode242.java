import java.lang.reflect.Array;
import java.util.Arrays;

public class Day3_LeetCode242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] StringS = s.toCharArray();
            char[] StringT = t.toCharArray();
            Arrays.sort(StringS);
            Arrays.sort(StringT);
            if (Arrays.equals(StringS,StringT)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
