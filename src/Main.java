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

        int[] num1 = {2, 5, 6, 0, 0, 1, 2};
        int[] num2 = {2, 5, 6, 0, 0, 1, 2};

        boolean result1 = Day8_LeetCode81.search(num1, 0);
        System.out.println(result1);
        boolean result2 = Day8_LeetCode81.search(num1, 3);
        System.out.println(result2);
    }
}
