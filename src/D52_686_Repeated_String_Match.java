public class D52_686_Repeated_String_Match {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        int count = 1;
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.indexOf(b) != -1) return count;
        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) return count;
        return -1;
    }
}
