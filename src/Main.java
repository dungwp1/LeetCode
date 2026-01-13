public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result1 = D22_496.nextGreaterElement(nums1, nums2);
        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        int[] result2 = D22_496.nextGreaterElement(nums3, nums4);
        int[] nums5 = {1, 3, 5, 2, 4};
        int[] nums6 = {6, 5, 4, 3, 2, 1, 7};
        int[] result3 = D22_496.nextGreaterElement(nums5, nums6);

        for (int i : result1) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result2) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result3) {
            System.out.println(i);
        }
    }
}
