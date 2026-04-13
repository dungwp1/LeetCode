public class D51_459_Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        String doubleString = (s + s).substring(1, s.length() * 2 - 1);
        return doubleString.contains(s);
    }
}
