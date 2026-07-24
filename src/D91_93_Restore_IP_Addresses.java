import java.util.ArrayList;
import java.util.List;

public class D91_93_Restore_IP_Addresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        if (n < 4 || n > 12) return result;
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> cart, List<String> result) {
        if (cart.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", cart));
            }
            return;
        }
        if (cart.size() < 4) {
            for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
                String path = s.substring(start, start + len);
                if (isValidPath(path)) {
                    cart.add(path);
                    backtrack(s, start + len, cart, result);
                    cart.removeLast();
                }
            }
        }
    }

    private boolean isValidPath(String path) {
        if (path.length() > 1 && path.charAt(0) == '0') return false;
        int num = Integer.parseInt(path);
        return num >= 0 && num <= 255;
    }
}
