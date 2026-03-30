public class D1_121 {
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int tempProfit = prices[i] - minPrice;
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = prices[i];
            } else {
                if (prices[i] > max) {
                    max = prices[i];
                    profit = Math.max(profit, max - min);
                }
            }
        }
        return profit;
    }
}
