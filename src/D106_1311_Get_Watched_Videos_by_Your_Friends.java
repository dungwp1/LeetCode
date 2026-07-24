import java.util.*;

public class D106_1311_Get_Watched_Videos_by_Your_Friends {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[watchedVideos.size()];
        queue.add(id);
        visited[id] = true;
        int currentLevel = 0;
        while (!queue.isEmpty()) {
            if (currentLevel == level) break;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int friend = queue.poll();
                for (int nextFriend : friends[friend]) {
                    if (!visited[nextFriend]) {
                        visited[nextFriend] = true;
                        queue.add(nextFriend);
                    }
                }
            }
            currentLevel++;
        }
        Map<String, Integer> map = new HashMap<>();
        while (!queue.isEmpty())
            for (String video : watchedVideos.get(queue.poll())) map.put(video, map.getOrDefault(video, 0) + 1);

        List<String> result = new ArrayList<>(map.keySet());

        result.sort((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(a) - map.get(b);
            }
            return a.compareTo(b);
        });
        return result;
    }
}
