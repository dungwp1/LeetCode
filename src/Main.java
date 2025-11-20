import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] prices1 = {7, 1, 5, 3, 6, 4};
//        int[] prices2 = {7, 6, 4, 3, 1};
//        int[] prices3 = {2, 4, 1};
//        int result1 = Day1_LeetCode121.maxProfit(prices1);
//        System.out.println(result1);
//        int result2 = Day1_LeetCode121.maxProfit(prices2);
//        System.out.println(result2);
//        int result3 = Day1_LeetCode121.maxProfit(prices3);
//        System.out.println(result3);

        int[] num2 = {1, 2, 3, 4};
        int[] num3 = {-1, 1, 0, -3, 3};

        int[] result2 = Day4_LeetCode238.productExceptSelf(num2);
        int[] result3 = Day4_LeetCode238.productExceptSelf(num3);
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
