public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] nums3 = {1};
        int[] nums4 = {};
        int[] nums5 = {0};
        int[] nums6 = {1};
        int[] nums7 = {4, 0, 0, 0, 0, 0};
        int[] nums8 = {1, 2, 3, 5, 6};
        int[] nums9 = {1, 0};
        int[] nums10 = {2};

        D29_88.merge(nums1, 3, nums2, 3);
        D29_88.merge(nums3, 1, nums4, 0);
        D29_88.merge(nums5, 0, nums6, 1);
        D29_88.merge(nums7, 1, nums8, 5);
        D29_88.merge(nums9, 1, nums10, 1);

        for (int i : nums1) System.out.println(i);
        System.out.println("-------------");
        for (int i : nums3) System.out.println(i);
        System.out.println("-------------");
        for (int i : nums5) System.out.println(i);
        System.out.println("-------------");
        for (int i : nums7) System.out.println(i);
        System.out.println("-------------");
        for (int i : nums9) System.out.println(i);


    }
}
