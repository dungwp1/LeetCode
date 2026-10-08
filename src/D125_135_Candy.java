import java.util.Arrays;

public class D125_135_Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];
        candy[0] = 1;
        for (int l = 1; l < n; l++) {
            if (ratings[l] > ratings[l - 1]) {
                candy[l] = candy[l - 1] + 1;
            } else {
                candy[l] = 1;
            }
        }
        int total = candy[n - 1];
        for (int r = n - 2; r >= 0; r--) {
            if (ratings[r] > ratings[r + 1]) {
                int temp = candy[r + 1] + 1;
                if (candy[r] < temp) {
                    candy[r] = temp;
                }
            }
            total += candy[r];
        }
        return total;
    }
}
