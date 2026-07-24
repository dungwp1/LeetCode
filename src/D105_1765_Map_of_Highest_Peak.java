import java.util.ArrayDeque;
import java.util.Queue;

public class D105_1765_Map_of_Highest_Peak {
    public int[][] highestPeak(int[][] isWater) {
        Queue<Integer> queue = new ArrayDeque<>();
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] output = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                output[r][c] = -1;
                if (isWater[r][c] == 1) {
                    output[r][c] = 0;
                    queue.add(r * cols + c);
                }
            }
        }
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            int index = queue.poll();
            int r = index / cols;
            int c = index % cols;
            for (int i = 0; i < 4; i++) {
                int nextR = r + dr[i];
                int nextC = c + dc[i];
                if (nextR >= 0 && nextR < rows && nextC >= 0 && nextC < cols && output[nextR][nextC] == -1) {
                    output[nextR][nextC] = output[r][c] + 1;
                    queue.add(nextR * cols + nextC);

                }
            }
        }
        return output;
    }
}
