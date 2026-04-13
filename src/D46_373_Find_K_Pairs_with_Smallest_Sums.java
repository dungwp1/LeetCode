import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class D46_373_Find_K_Pairs_with_Smallest_Sums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            int[] e = {nums1[i] + nums2[0], i, 0};
            pq.add(e);
        }
        List<List<Integer>> result = new ArrayList<>();
        while (!pq.isEmpty() && k > 0) {
            int[] minPair = pq.poll();
            int n1 = minPair[1];
            int n2 = minPair[2];
            result.add(Arrays.asList(nums1[n1], nums2[n2]));
            if (n2 < nums2.length - 1) {
                int[] newPair = {nums1[n1] + nums2[n2 + 1], n1, n2 + 1};
                pq.add(newPair);
            }
            k--;
        }
        return result;
    }
}
