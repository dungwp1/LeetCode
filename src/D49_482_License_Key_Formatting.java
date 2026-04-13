public class D49_482_License_Key_Formatting {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (len == k) {
                    sb.append("-");
                    len = 0;
                }
                sb.append(Character.toUpperCase(c));
                len++;

            }
        }
        return sb.reverse().toString();
    }
}
