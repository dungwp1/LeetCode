import java.util.Arrays;

public class D31_455 {
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0, result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int k : s) {
            if (k >= g[i]) {
                result++;
                i++;
            }
            if (i == g.length) break;
        }
        return result;
    }
}
