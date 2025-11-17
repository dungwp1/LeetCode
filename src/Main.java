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

        int[] num1 = {1, 2, 3, 1};
        int[] num2 = {1, 2, 3, 4};
        int[] num3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean result1 = Day2_LeetCode217.containsDuplicate(num1);
        boolean result2 = Day2_LeetCode217.containsDuplicate(num2);
        boolean result3 = Day2_LeetCode217.containsDuplicate(num3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
