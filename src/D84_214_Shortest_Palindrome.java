public class D84_214_Shortest_Palindrome {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;
        long B = 31, M = 1000000007, power = 1, hash = 0, hashReverse = 0;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a' + 1;
            hash = (hash * B + c) % M;
            hashReverse = (hashReverse + c * power) % M;
            power = (power * B) % M;
            if (hash == hashReverse) lastIndex = i;
        }
        StringBuilder sb = new StringBuilder(s.substring(lastIndex + 1)).reverse();
        sb.append(s);
        return sb.toString();
    }
}
