public class Main {
    public static void main(String[] args) {

        int[] num1 = {2, 3, 1, 2, 4, 3};
        int[] num2 = {1, 4, 4};
        int[] num3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] num4 = {1, 2, 3, 4, 5};
        int[] num5 = {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};

        int result1 = Day10_LeetCode209.minSubArrayLen(7, num1);
        System.out.println(result1);
        int result2 = Day10_LeetCode209.minSubArrayLen(4, num2);
        System.out.println(result2);
        int result3 = Day10_LeetCode209.minSubArrayLen(11, num3);
        System.out.println(result3);
        int result4 = Day10_LeetCode209.minSubArrayLen(11, num4);
        System.out.println(result4);
        int result5 = Day10_LeetCode209.minSubArrayLen(15, num4);
        System.out.println(result5);
        int result6 = Day10_LeetCode209.minSubArrayLen(15, num5);
        System.out.println(result6);
    }
}
