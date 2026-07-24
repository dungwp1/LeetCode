import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {
    int n;
    List<int[]>[] adj;


    public Graph(int n, int[][] edges) {
        this.n = n;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) adj[i] = new ArrayList<>();
        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    public void addEdge(int[] edge) {
        int u = edge[0];
        int v = edge[1];
        int weight = edge[2];
        adj[u].add(new int[]{v, weight});
    }

    public int shortestPath(int node1, int node2) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.add(new int[]{node1, 0});
        dist[node1] = 0;

        while (!pq.isEmpty()) {
            int[] currentNode = pq.poll();
            int current = currentNode[0];
            int currentWeight = currentNode[1];
            if (current == node2) return currentWeight;

            if (currentWeight > dist[current]) continue;

            for (int[] neighbour : adj[current]) {
                int next = neighbour[0];
                int weight = neighbour[1];
                if (currentWeight + weight < dist[next]) {
                    dist[next] = currentWeight + weight;
                    pq.add(new int[]{next, dist[next]});
                }
            }
        }
        return -1;
    }
}
