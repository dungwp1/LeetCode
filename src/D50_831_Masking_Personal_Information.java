public class D50_831_Masking_Personal_Information {
    public String maskPII(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        if (s.contains("@")) {
            String[] arr = s.split("@");
            sb.append(arr[0].charAt(0));
            sb.append("*****");
            sb.append(arr[0].charAt(arr[0].length() - 1));
            sb.append("@");
            sb.append(arr[1]);
        } else {
            StringBuilder num = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) num.append(c);
            }
            int len = num.length();
            for (int i = 0; i < 4; i++) {
                sb.append(num.charAt(i));
            }
            sb.append("-***-***");
            if (len > 10) {
                sb.append("-");
                sb.append("*".repeat(len - 10));
                sb.append("+");
            }
            sb.reverse();
        }
        return sb.toString();
    }
}
