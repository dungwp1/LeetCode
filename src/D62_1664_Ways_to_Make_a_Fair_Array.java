public class D62_1664_Ways_to_Make_a_Fair_Array {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int fairs = 0;
        long totalOdd = 0, totalEven = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                totalEven += nums[i];
            } else {
                totalOdd += nums[i];
            }
        }
        long beforeOdd = 0;
        long beforeEven = 0;
        for (int i = 0; i < n; i++) {
            long newEven;
            long newOdd;
            int currentNum = nums[i];

            //            Số lẻ
            if (i % 2 == 0) {
//                currentNum là số chẵn
//                Chẵn mới = Chẵn trước + Lẻ sau
//                Lẻ sau = Tổng lẻ - lẻ trước
                newEven = beforeEven + (totalOdd - beforeOdd);
//                Lẻ mới = Lẻ trước + Chẵn sau
//                Chẵn sau = Tổng chẵn - chẵn trước - currentNum
                newOdd = beforeOdd + (totalEven - beforeEven - currentNum);
            } else {
//                currentNum là số lẻ
//                Chẵn mới = Chẵn trước + Lẻ sau
//                Lẻ sau = Tổng lẻ - lẻ trước - currentNum
                newEven = beforeEven + (totalOdd - beforeOdd - currentNum);
//                Lẻ mới = Lẻ trước + Chẵn sau
//                Chẵn sau = Tổng chẵn - chẵn trước
                newOdd = beforeOdd + (totalEven - beforeEven);
            }
            if (newOdd == newEven) fairs++;
//            Cập nhật before
            if (i % 2 == 0) {
//                currentNum là số chẵn -> update chẵn
                beforeEven += currentNum;
            } else {
                beforeOdd += currentNum;
            }
        }
        return fairs;
    }
}
