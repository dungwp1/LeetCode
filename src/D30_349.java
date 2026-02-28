import java.util.HashSet;
import java.util.Set;

public class D30_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> confirm = new HashSet<>();
        Set<Integer> number = new HashSet<>();
        for (int i : nums1) number.add(i);
        for (int i : nums2) {
            if (number.contains(i)) {
                confirm.add(i);
                number.remove(i);
            }
        }
        int[] result = new int[confirm.size()];
        int j = 0;
        for (int i : confirm) {
            result[j] = i;
            j++;
        }
        return result;
    }
}
