public class D82_1358_Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] abc = new int[3];
        int count = 0, left = 0;
        for (int right = 0; right < n; right++) {
            abc[s.charAt(right) - 'a']++;
            while (abc[0] > 0 && abc[1] > 0 && abc[2] > 0) {
                count += n - right;
                abc[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}
