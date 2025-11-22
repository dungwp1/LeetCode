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

        int[] num1 = {1, 2};
        int[] num2 = {4, 5, 6, 7, 0, 1, 2};
        int[] num3 = {11, 13, 15, 17};
        int[] num4 = {3, 4, 5, 1, 2};

        int result1 = Day6_LeetCode153.findMin(num1);
        System.out.println(result1);
        int result2 = Day6_LeetCode153.findMin(num2);
        System.out.println(result2);
        int result3 = Day6_LeetCode153.findMin(num3);
        System.out.println(result3);
        int result4 = Day6_LeetCode153.findMin(num4);
        System.out.println(result4);
    }
}
