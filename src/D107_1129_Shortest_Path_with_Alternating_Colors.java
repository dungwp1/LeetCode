import java.util.*;

public class D107_1129_Shortest_Path_with_Alternating_Colors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
//        Quy ước: red = 0 | blue = 1
        boolean[][] visited = new boolean[n][2];
        int[] result = new int[n];
        Queue<Integer[]> queue = new ArrayDeque<>();
        List<Integer>[] blueAdj = new ArrayList[n];
        List<Integer>[] redAdj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            blueAdj[i] = new ArrayList<>();
            redAdj[i] = new ArrayList<>();
            result[i] = -1;
        }
        for (int[] redEdge : redEdges) {
            int source = redEdge[0];
            int destination = redEdge[1];
            redAdj[source].add(destination);
        }
        for (int[] blueEdge : blueEdges) {
            int source = blueEdge[0];
            int destination = blueEdge[1];
            blueAdj[source].add(destination);
        }
        queue.add(new Integer[]{0, -1});
        result[0] = 0;
        int step = 0;


        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer[] currentNode = queue.poll();
                int current = currentNode[0];
                int currentColor = currentNode[1];

//                Đi đỏ
                if (currentColor == -1 || currentColor == 1) {
                    List<Integer> nextNode = redAdj[current];
                    for (int next : nextNode) {
                        if (!visited[next][0]) {
                            visited[next][0] = true;
                            queue.add(new Integer[]{next, 0});
                            if (result[next] == -1) result[next] = step + 1;
                        }
                    }
                }
                
//                Đi xanh
                if (currentColor == -1 || currentColor == 0) {
                    List<Integer> nextNode = blueAdj[current];
                    for (int next : nextNode) {
                        if (!visited[next][1]) {
                            visited[next][1] = true;
                            queue.add(new Integer[]{next, 1});
                            if (result[next] == -1) result[next] = step + 1;
                        }
                    }
                }
            }
            step++;
        }
        return result;
    }
}
