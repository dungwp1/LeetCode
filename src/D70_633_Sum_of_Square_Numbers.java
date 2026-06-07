public class D70_633_Sum_of_Square_Numbers {
    public static boolean judgeSquareSum(int c) {
        int x = 0;
        long y = (long) Math.sqrt(c);
        while (x <= y) {
            long square = (long) x * x + y * y;
            if (square == c) return true;
            if (square > c) y--;
            else x++;
        }
        return false;
    }
}
