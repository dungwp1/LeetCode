
public class D20_387 {
    public static int firstUniqChar(String s) {
        int n = s.length();
        int[] arrayChar = new int[26];
        char a = 'a';
        for (int i = 0; i < n; i++) {
            arrayChar[s.charAt(i) - a]++;
        }
        for (int i = 0; i < n; i++) {
            if (arrayChar[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
