import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class D44_2073_Time_Needed_to_Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        int step = 0;
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            int index = queue.poll();
            tickets[index]--;
            step++;

            if (tickets[k] == 0) return step;

            if (tickets[index] > 0) {
                queue.add(index);
            }
        }
        return step;
    }
}
