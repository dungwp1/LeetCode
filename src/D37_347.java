import java.util.*;

public class D37_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] result = new int[k];
        int j = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int e : bucket[i]) {
                    result[j] = e;
                    j++;
                    if (j == k) return result;
                }
            }
        }
        return result;
    }
}
