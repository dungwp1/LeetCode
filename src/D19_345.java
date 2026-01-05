public class D19_345 {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if ("aeiouAEIOU".indexOf(chars[left]) != -1) {
                if ("aeiouAEIOU".indexOf(chars[right]) != -1) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return String.copyValueOf(chars);
    }
}
