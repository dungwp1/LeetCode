public class D80_481_Magical_String {
    public static int magicalString(int n) {
        if (n <= 0) return 0;
        if (n < 3) return 1;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 2;
        int curentIndex = 2;
        int addIndex = 3;
        while (addIndex < n) {
            int lastNum = nums[addIndex - 1];
            int addNum = lastNum == 2 ? 1 : 2;
            int countAdd = nums[curentIndex];
            while (countAdd > 0 && addIndex < n) {
                nums[addIndex] = addNum;
                addIndex++;
                countAdd--;
            }
            curentIndex++;
        }
        int count = 0;
        for (int i : nums) {
            if (i == 1) count++;
        }
        return count;
    }
}
