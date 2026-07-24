import java.util.ArrayList;
import java.util.List;

public class D94_1971_Find_if_Path_Exists_in_Graph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        List<Integer>[] graph = new ArrayList[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
            visited[i] = false;
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        visited[source] = true;
        return dfs(graph, visited, source, destination);
    }

    private boolean dfs(List<Integer>[] graph, boolean[] visited, int source, int destination) {
        if (source == destination) return true;
        visited[source] = true;
        for (int i : graph[source]) {
            if (!visited[i])
                if (dfs(graph, visited, i, destination)) {
                    return true;
                }
        }
        return false;
    }


}
