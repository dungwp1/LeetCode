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

        int[] num1 = {4, 5, 6, 7, 0, 1, 2};
        int[] num2 = {1};

        int result1 = Day7_LeetCode33.search(num1, 0);
        System.out.println(result1);
        int result2 = Day7_LeetCode33.search(num1, 3);
        System.out.println(result2);
        int result3 = Day7_LeetCode33.search(num2, 0);
        System.out.println(result3);
    }
}
