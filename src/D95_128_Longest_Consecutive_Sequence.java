import java.util.HashMap;
import java.util.Map;

public class D95_128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] parents = new int[n];
        int[] sizes = new int[n];
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
            parents[i] = i;
            sizes[i] = 1;
        }
        for (int num : nums) {
            int numNext = num + 1;
            if (map.containsKey(numNext)) {
                union(map.get(num), map.get(numNext), parents, sizes);
            }
        }
        int max = 0;
        for (int size : sizes) max = Math.max(max, size);
        return max;
    }

    private void union(int indexCur, int indexNext, int[] parents, int[] sizes) {
        int RootI = find(indexCur, parents);
        int RootJ = find(indexNext, parents);
        if (RootI != RootJ) {
            parents[RootI] = RootJ;
            sizes[RootJ] += sizes[RootI];
        }
    }

    private int find(int index, int[] parents) {
        if (parents[index] == index) return index;
        return parents[index] = find(parents[index], parents);
    }
}
