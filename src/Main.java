public class Main {
    public static void main(String[] args) {

        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "axc", t2 = "ahbgdc";
        String s3 = "acb", t3 = "ahbgdc";
        String s4 = "aaaaaa", t4 = "bbaaaa";
        boolean result1 = Day11_LeetCode392.isSubsequence(s1, t1);
        boolean result2 = Day11_LeetCode392.isSubsequence(s2, t2);
        boolean result3 = Day11_LeetCode392.isSubsequence(s3, t3);
        boolean result4 = Day11_LeetCode392.isSubsequence(s4, t4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
