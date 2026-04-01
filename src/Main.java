import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int[] heights2 = {2, 4};
        int[] heights3 = {1};
        int[] heights4 = {2, 1, 2};
        int[] heights5 = {4, 2, 3};
        System.out.println(D40_84.largestRectangleArea(heights1));
        System.out.println(D40_84.largestRectangleArea(heights2));
        System.out.println(D40_84.largestRectangleArea(heights3));
        System.out.println(D40_84.largestRectangleArea(heights4));
        System.out.println(D40_84.largestRectangleArea(heights5));
    }
}
