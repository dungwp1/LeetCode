import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumArray na = new NumArray(new int[]{1, 3, 5});
        System.out.println(Arrays.toString(na.tree));
        na.update(2, 10);
        System.out.println(Arrays.toString(na.tree));
        System.out.println(na.sumRange(1, 2));


    }
}
