public class Day11_LeetCode392 {
    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int tempJ = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = tempJ; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    tempJ = j + 1;
                    break;
                }
            }
        }
        return count == s.length();
    }
}
