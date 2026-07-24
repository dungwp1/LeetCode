import java.util.*;

public class D109_743_Network_Delay_Time {
    public int networkDelayTime(int[][] times, int n, int k) {
        int delayTime = -1;
        int[] distance = new int[n + 1];
        List<int[]>[] adj = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            adj[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }
        for (int[] t : times) {
            int source = t[0];
            int destination = t[1];
            int time = t[2];
            int[] element = new int[]{destination, time};
            adj[source].add(element);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{k, 0});
        distance[k] = 0;
        while (!pq.isEmpty()) {
            int[] currentPath = pq.poll();
            int currentNode = currentPath[0];
            int currentTime = currentPath[1];

            if (currentTime > distance[currentNode]) continue;

            for (int[] neighbourNode : adj[currentNode]) {
                int neighbour = neighbourNode[0];
                int time = neighbourNode[1];
                int delay = currentTime + time;

                if (delay < distance[neighbour]) {
                    distance[neighbour] = delay;
                    pq.add(new int[]{neighbour, delay});
                }
            }
        }
        for (int i = 1; i < distance.length; i++) delayTime = Math.max(delayTime, distance[i]);
        return (delayTime == Integer.MAX_VALUE) ? -1 : delayTime;
    }
}
