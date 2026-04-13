import java.util.HashMap;
import java.util.Map;

public class D57_1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int candidate = target - nums[i];
            if (indexMap.containsKey(candidate) && i != indexMap.get(candidate)) {
                return new int[]{i, indexMap.get(candidate)};
            }
        }
        return null;
    }
}
/**
 * Solution:
 * Dùng HashMap để lưu nums theo key-value: giá trị của phần tử - index của phần tử => Time: O(n)
 * Duyệt từng phần tử của nums:
 * - Tính giá trị cần tìm (số hạng còn lại của sum) O(1)
 * - Tìm phần tử có tồn tại trong HashMap ~O(1) hoặc O(logN)
 * - Return result nếu tồn tại O(1)
 * -> Tổng time sau khi duyệt: ~O(n)
 * <p>
 * => Time Complexity cả bài: O(n) hoặc O(nlogn) (thỏa yêu cầu < O(n*n)
 */