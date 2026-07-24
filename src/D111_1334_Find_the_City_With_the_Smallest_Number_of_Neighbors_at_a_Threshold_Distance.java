import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class D111_1334_Find_the_City_With_the_Smallest_Number_of_Neighbors_at_a_Threshold_Distance {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<int[]>[] adj = new ArrayList[n];
        int minNeighbour = Integer.MAX_VALUE;
        int resultCity = 0;
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            if (edge[2] <= distanceThreshold) {
                adj[edge[0]].add(new int[]{edge[1], edge[2]});
                adj[edge[1]].add(new int[]{edge[0], edge[2]});
            }
        }
        for (int i = 0; i < n; i++) {
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
            pq.add(new int[]{i, 0});
            dist[i] = 0;
            while (!pq.isEmpty()) {
                int[] element = pq.poll();
                int currentCity = element[0];
                int currentPath = element[1];

                if (currentPath > dist[currentCity]) continue;

                for (int[] nextCity : adj[currentCity]) {
                    int next = nextCity[0];
                    int cost = nextCity[1];
                    if (cost + currentPath < dist[next]) {
                        dist[next] = cost + currentPath;
                        pq.add(new int[]{next, dist[next]});
                    }
                }
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && dist[j] <= distanceThreshold) count++;
            }
            if (count <= minNeighbour) {
                minNeighbour = count;
                resultCity = i;
            }
        }
        return resultCity;
    }
}
