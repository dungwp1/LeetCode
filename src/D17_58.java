public class D17_58 {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        boolean isLetter = false;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (!isLetter) {
                    continue;
                } else {
                    break;
                }
            } else {
                isLetter = true;
                count++;
            }
        }
        return count;
    }
}
