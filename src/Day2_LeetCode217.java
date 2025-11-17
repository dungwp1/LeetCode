import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */

public class Day2_LeetCode217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> arrNum = new HashSet<>();
        for (int i : nums) {
            if (!arrNum.contains(i)) {
                arrNum.add(i);
            } else {
                return true;
            }
        }
        return false;
    }
}
