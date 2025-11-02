/**
 * Chỉ dùng 1 vòng lặp duy nhất
 * Hướng đi:
 * B1. Lặp từng phần tử và check
 * - Nếu là phần tử min => Gán lại vào min
 * - Nếu không phải là phần từ min => Tính lãi so với min => So sánh với maxProfit
 * - Nếu lãi > maxProfit => Gán lãi vào maxProfit
 * - Nếu lãi < maxProfit => Nothing, tiếp tục vòng lặp
 **/

public class Day1_LeetCode121 {
    public static int maxProfit(int[] prices) {
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
}
