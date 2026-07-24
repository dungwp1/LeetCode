public class D92_1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n {
    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        String[] result = new String[]{""};
        char[] abc = new char[]{'a', 'b', 'c'};
        int[] count = new int[]{0};
        backtrack(n, k, count, sb, abc, result);
        return result[0];
    }

    private void backtrack(int n, int k, int[] count, StringBuilder sb, char[] abc, String[] result) {
        if (sb.length() == n) {
            count[0]++;
            if (count[0] == k) result[0] = sb.toString();
            return;
        }
        char lastChar = (sb.length() > 0) ? sb.charAt(sb.length() - 1) : ' ';
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == lastChar) continue;
            sb.append(abc[i]);
            backtrack(n, k, count, sb, abc, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
