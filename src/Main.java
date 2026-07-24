import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[][] watchedVideos1 = {{"A", "B"}, {"C"}, {"B", "C"}, {"D"}};
        List<List<String>> watchedVideos = new ArrayList<>();
        for (String[] videos : watchedVideos1) {
            watchedVideos.add(Arrays.asList(videos));
        }
        int[][] friends = {{1, 2}, {0, 3}, {0, 3}, {1, 2}};
        int id = 0, level = 1;
    }
}
