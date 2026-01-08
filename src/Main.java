public class Main {
    public static void main(String[] args) {
        System.out.println(D21_20.isValid("()"));
        System.out.println(D21_20.isValid("()[]{}"));
        System.out.println(D21_20.isValid("(]"));
        System.out.println(D21_20.isValid("([])"));
        System.out.println(D21_20.isValid("([)]"));
    }
}
