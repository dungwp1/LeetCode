import java.util.Arrays;

public class D122_1584_Min_Cost_to_Connect_All_Points {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int cost = 0;
//        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
//        minHeap.add(new int[]{0, 0});
//        while (!minHeap.isEmpty()) {
//            int[] minNode = minHeap.poll();
//            int currentCost = minNode[0];
//            int currentPoint = minNode[1];
//
//            if (!visited[currentPoint]) {
//                visited[currentPoint] = true;
//                cost += currentCost;
//                for (int i = 0; i < n; i++) {
//                    if (!visited[i]) {
//                        minHeap.add(new int[]{distance(points[currentPoint], points[i]), i});
//                    }
//                }
//            }
//        }
        int[] minDist = new int[n];
        Arrays.fill(minDist, Integer.MAX_VALUE);
        minDist[0] = 0;

        for (int step = 0; step < n; step++) {
            int u = -1;
            int min = minDist[step];
            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || minDist[i] < minDist[u])) {
                    u = i;
                }
            }
            visited[u] = true;
            cost += minDist[u];
            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int distUV = distance(points[u], points[v]);
                    minDist[v] = Math.min(minDist[v], distUV);
                }
            }
        }
        return cost;
    }

    private int distance(int[] pointU, int[] pointV) {
        return Math.abs(pointU[0] - pointV[0]) + Math.abs(pointU[1] - pointV[1]);
    }
}
