import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int[] nums4 = {1, 2, 1};
        int[] nums5 = {0, 1, 2, 3, 2, 5};
        System.out.println(D81_219_Contains_Duplicate_II.containsNearbyDuplicate(nums1, 3));
        System.out.println(D81_219_Contains_Duplicate_II.containsNearbyDuplicate(nums2, 1));
        System.out.println(D81_219_Contains_Duplicate_II.containsNearbyDuplicate(nums3, 2));
        System.out.println(D81_219_Contains_Duplicate_II.containsNearbyDuplicate(nums4, 0));
        System.out.println(D81_219_Contains_Duplicate_II.containsNearbyDuplicate(nums5, 3));
    }
}
