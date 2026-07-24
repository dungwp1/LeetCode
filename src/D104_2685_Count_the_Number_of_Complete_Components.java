import java.util.ArrayList;
import java.util.List;

public class D104_2685_Count_the_Number_of_Complete_Components {
    public int countCompleteComponents(int n, int[][] edges) {
        int count = 0;
        List<Integer>[] adj = new ArrayList[n];
        boolean[] visited = new boolean[n];
        int[] countEdge = new int[1];
        int[] countNode = new int[1];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                countEdge[0] = 0;
                countNode[0] = 0;
                dfs(i, adj, visited, countEdge, countNode);
                if (countEdge[0] == countNode[0] * (countNode[0] - 1)) count++;
            }
        }
        return count;
    }

    private void dfs(int current, List<Integer>[] adj, boolean[] visited, int[] countEdge, int[] countNode) {
        visited[current] = true;
        countNode[0]++;
        countEdge[0] += adj[current].size();
        for (int next : adj[current]) {
            if (!visited[next]) dfs(next, adj, visited, countEdge, countNode);
        }
    }
}
