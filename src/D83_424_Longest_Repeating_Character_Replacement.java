public class D83_424_Longest_Repeating_Character_Replacement {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int[] letters = new int[26];
        int mostChar = 0;
        int longest = 0;
        for (int right = 0; right < n; right++) {
            letters[s.charAt(right) - 'A']++;
            mostChar = Math.max(mostChar, letters[s.charAt(right) - 'A']);
            while (right - left + 1 - mostChar > k) {
                letters[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
