public class D85_1392_Longest_Happy_Prefix {
    public String longestPrefix(String s) {
        int n = s.length();
        long hashPrefix = 0, hashSuffix = 0, B = 31, M = 1000000007, power = 1;
        int index = -1;
        for (int i = 0; i < n - 1; i++) {
            int prefix = s.charAt(i) - 'a' + 1;
            int suffix = s.charAt(n - 1 - i) - 'a' + 1;
            hashPrefix = (hashPrefix * B + prefix) % M;
            hashSuffix = (hashSuffix + suffix * power) % M;
            power = power * B % M;
            if (hashPrefix == hashSuffix) index = i;
        }
        return index == -1 ? "" : s.substring(0, index + 1);
    }
}
