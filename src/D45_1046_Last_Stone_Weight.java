import java.util.Collections;
import java.util.PriorityQueue;

public class D45_1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            maxHeap.add(i);
        }
        while (!maxHeap.isEmpty()) {
            int stone1 = maxHeap.poll();
            if (maxHeap.isEmpty()) return stone1;
            int stone2 = maxHeap.poll();
            if (stone2 != stone1) {
                maxHeap.add(stone1 - stone2);
            }
        }
        return 0;
    }
}
