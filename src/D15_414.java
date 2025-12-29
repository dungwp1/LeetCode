public class D15_414 {
    public static int thirdMax(int[] nums) {
        Long max1 = null, max2 = null, max3 = null;

        for (int num : nums) {
            // skip duplicates
            if ((max1 != null && num == max1) ||
                    (max2 != null && num == max2) ||
                    (max3 != null && num == max3)) {
                continue;
            }

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = (long) num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = (long) num;
            } else if (max3 == null || num > max3) {
                max3 = (long) num;
            }
        }

        return max3 == null ? max1.intValue() : max3.intValue();

    }
}
