import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class D102_2492_Minimum_Score_of_a_Path_Between_Two_Cities {
    public int minScore(int n, int[][] roads) {
        int[] minScore = new int[]{Integer.MAX_VALUE};
        boolean[] visited = new boolean[n + 1];
        List<int[]>[] adj = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] road : roads) {
            int score = road[2];
            adj[road[0]].add(new int[]{road[1], score});
            adj[road[1]].add(new int[]{road[0], score});
        }
        dfs(1, adj, visited, minScore);

        return minScore[0];
    }

    private void dfs(int current, List<int[]>[] adj, boolean[] visited, int[] minScore) {
        visited[current] = true;
        for (int[] nextNode : adj[current]) {
            int next = nextNode[0];
            int score = nextNode[1];
            minScore[0] = Math.min(minScore[0], score);
            if (!visited[next]) dfs(next, adj, visited, minScore);
        }
    }
}
