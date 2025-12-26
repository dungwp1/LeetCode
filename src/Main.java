public class Main {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] nums2 = {1, 0, 1};
        int[] nums3 = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};


        D14_283.moveZeroes(nums3);
        for (int i : nums3) System.out.println(i);
        System.out.println("--------------");

        D14_283.moveZeroes(nums2);
        for (int i : nums2) System.out.println(i);
        System.out.println("--------------");

        D14_283.moveZeroes(nums1);
        for (int i : nums1) System.out.println(i);
    }
}
