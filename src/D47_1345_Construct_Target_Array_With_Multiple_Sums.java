import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class D47_1345_Construct_Target_Array_With_Multiple_Sums {
    public boolean isPossible(int[] target) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (long i : target) {
            pq.add(i);
            sum += i;
        }
        while (!pq.isEmpty() && pq.peek() > 1) {
            long numMax = pq.poll();
            long restNum = sum - numMax;
            if (restNum == 1) return true;
            if (restNum == 0) return false;
            if (numMax < restNum || numMax % restNum == 0) return false;
            long preMax = numMax % restNum;
            pq.add(preMax);
            sum = preMax + restNum;
        }
        return true;
    }
}
