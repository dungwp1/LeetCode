import com.sun.source.tree.BreakTree;

public class D41_66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int memory = 1;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = digits[i] + memory;
            if (digits[i] != 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        int idx = 1;
        for (int d : digits) {
            result[idx] = d;
            idx++;
        }
        result[0] = 1;
        return result;
    }
}
