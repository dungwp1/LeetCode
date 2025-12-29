public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 1};
        int[] nums2 = {1, 2};
        int[] nums3 = {2, 2, 3, 1};
        int[] nums4 = {1, 2, -2147483648};


        System.out.println("--------------" + D15_414.thirdMax(nums1));
        System.out.println("--------------" + D15_414.thirdMax(nums2));
        System.out.println("--------------" + D15_414.thirdMax(nums3));
        System.out.println("--------------" + D15_414.thirdMax(nums4));
    }
}
