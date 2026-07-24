import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class D101_797_All_Paths_From_Source_to_Target {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0, path, graph, result);
        return result;
    }

    private void dfs(int current, List<Integer> path, int[][] graph, List<List<Integer>> result) {
        path.add(current);

        if (current == graph.length - 1) {
            result.add(new ArrayList<>(path));
        } else {
            for (int next : graph[current]) {
                dfs(next, path, graph, result);
            }
        }
        path.removeLast();
    }
}
