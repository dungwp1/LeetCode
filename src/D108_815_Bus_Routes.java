import java.util.*;

public class D108_815_Bus_Routes {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        boolean[] visitedXe = new boolean[routes.length];
        Set<Integer> visitedTram = new HashSet<>();
        if (source == target) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                int tram = routes[i][j];
                int xe = i;
                if (!map.containsKey(tram)) map.put(tram, new ArrayList<>());
                map.get(tram).add(xe);
            }
        }
        if (!map.containsKey(source) || !map.containsKey(target)) return -1;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int xe : map.get(source)) {
            queue.add(xe);
            visitedXe[xe] = true;
        }
        visitedTram.add(source);

        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int currentXe = queue.poll();
                for (int tram : routes[currentXe]) {
                    if (tram == target) return step;
                    if (!visitedTram.contains(tram)) {
                        visitedTram.add(tram);
                        for (int xe : map.get(tram)) {
                            if (!visitedXe[xe]) {
                                queue.add(xe);
                                visitedXe[xe] = true;
                            }
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
