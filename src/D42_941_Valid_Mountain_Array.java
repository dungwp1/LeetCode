import java.util.Stack;

public class D42_941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        boolean down = false;
        int up = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (down) return false;
                up++;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            } else {
                down = true;
            }
        }
        return up > 0 && down;
    }
}
