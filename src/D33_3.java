import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D33_3 {
    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> charSet = new HashSet<>();
        int max = 0, result = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (charSet.contains(c)) {
                charSet.remove(s.charAt(index));
                index++;
                max--;
            }
            charSet.add(c);
            max++;
            result = Math.max(result, max);
        }
        return result;
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (charMap.containsKey(c)) {
                left = Math.max(left, charMap.get(c) + 1);
            }
            charMap.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
