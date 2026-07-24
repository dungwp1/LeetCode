import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class D110_2203_Minimum_Weighted_Subgraph_With_the_Required_Paths {
    public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
        long result = Long.MAX_VALUE;
        List<int[]>[] graph = new ArrayList[n];
        List<int[]>[] reverseGraph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            reverseGraph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            int weight = edge[2];
            graph[source].add(new int[]{destination, weight});
            reverseGraph[destination].add(new int[]{source, weight});
        }

        long[] dist1 = new long[n];
        long[] dist2 = new long[n];
        long[] reverseDist = new long[n];

        Arrays.fill(dist1, Long.MAX_VALUE);
        Arrays.fill(dist2, Long.MAX_VALUE);
        Arrays.fill(reverseDist, Long.MAX_VALUE);

        dist1 = minPath(graph, dist1, src1);
        dist2 = minPath(graph, dist2, src2);
        reverseDist = minPath(reverseGraph, reverseDist, dest);

        for (int i = 0; i < n; i++) {
            if (dist1[i] == Long.MAX_VALUE || dist2[i] == Long.MAX_VALUE || reverseDist[i] == Long.MAX_VALUE)
                continue;
            long minPath = dist1[i] + dist2[i] + reverseDist[i];
            result = Math.min(result, minPath);
        }

        return (result == Long.MAX_VALUE) ? -1 : result;
    }

    private long[] minPath(List<int[]>[] graph, long[] dist, int source) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.add(new long[]{source, 0});
        dist[source] = 0;

        while (!pq.isEmpty()) {
            long[] currentNode = pq.poll();
            int current = (int) currentNode[0];
            long currentWeight = currentNode[1];

            if (currentWeight > dist[current]) continue;

            for (int[] neighbour : graph[current]) {
                int next = neighbour[0];
                int weight = neighbour[1];
                long nextWeight = currentWeight + weight;

                if (nextWeight < dist[next]) {
                    dist[next] = nextWeight;
                    pq.add(new long[]{next, nextWeight});
                }
            }
        }
        return dist;
    }
}
