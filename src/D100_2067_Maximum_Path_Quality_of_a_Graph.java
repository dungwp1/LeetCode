import java.util.ArrayList;
import java.util.List;

public class D100_2067_Maximum_Path_Quality_of_a_Graph {
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        int n = values.length;
        int[] score = new int[1];
        List<int[]>[] adj = new ArrayList[n];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            int time = edge[2];
            adj[node1].add(new int[]{node2, time});
            adj[node2].add(new int[]{node1, time});
        }
        int[] visited = new int[n];
        visited[0] = 1;
        findPath(0, 0, values[0], values, maxTime, score, adj, visited);
        return score[0];
    }

    private void findPath(int current, int currentTime, int currentValue, int[] values, int maxTime, int[] score, List<int[]>[] adj, int[] visited) {
        if (current == 0) {
            score[0] = Math.max(score[0], currentValue);
        }
        for (int[] neighbor : adj[current]) {
            int next = neighbor[0];
            int time = neighbor[1];

            if (currentTime + time <= maxTime) {
                int scoreGain = 0;

                if (visited[next] == 0) {
                    scoreGain = values[next];
                }
                visited[next]++;
                findPath(next, currentTime + time, currentValue + scoreGain, values, maxTime, score, adj, visited);
                visited[next]--;
            }
        }
    }
}
