public class Main {
    public static void main(String[] args) {
        int[] prices1 = {8, 4, 6, 2, 3};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {10, 1, 1, 6};
        int[] result1 = D24_1475.finalPrices(prices1);
        int[] result2 = D24_1475.finalPrices(prices2);
        int[] result3 = D24_1475.finalPrices(prices3);

        for (int i : result1) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result2) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result3) {
            System.out.println(i);
        }
    }
}
