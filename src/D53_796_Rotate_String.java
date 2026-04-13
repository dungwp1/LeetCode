public class D53_796_Rotate_String {
    public boolean rotateString(String s, String goal) {
        return (s + s).contains(goal);
    }
}
