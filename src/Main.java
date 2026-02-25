public class Main {
    public static void main(String[] args) {
        String s1 = "ab#c";
        String t1 = "ad#c";
        String s2 = "ab##";
        String t2 = "c#d#";
        String s3 = "a#c";
        String t3 = "b";
        String s4 = "acd##";
        String t4 = "bc##a";

        System.out.println(D28_844.backspaceCompare(s1, t1));
        System.out.println(D28_844.backspaceCompare(s2, t2));
        System.out.println(D28_844.backspaceCompare(s3, t3));
        System.out.println(D28_844.backspaceCompare(s4, t4));
    }
}
