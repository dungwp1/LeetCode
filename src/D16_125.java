public class D16_125 {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            char charL = Character.toLowerCase(s.charAt(l));
            char charR = Character.toLowerCase(s.charAt(r));
            if (!Character.isLetterOrDigit(charL)) {
                l++;
            } else if (!Character.isLetterOrDigit(charR)) {
                r--;
            } else if (charL == charR) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
