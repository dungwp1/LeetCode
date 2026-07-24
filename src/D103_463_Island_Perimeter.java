import org.w3c.dom.xpath.XPathResult;

import java.util.ArrayDeque;
import java.util.Queue;

public class D103_463_Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length; // số phần tử dọc của mảng 2D
        int cols = grid[0].length; // số phần tử ngang của mảng 2D
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    return dfs(r, c, grid, dr, dc);
                }
            }
        }
        return 0;
    }

    private int dfs(int r, int c, int[][] grid, int[] dr, int[] dc) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) return 1;
        if (grid[r][c] == -1) return 0;
        grid[r][c] = -1;
        int perimeter = 0;
        for (int i = 0; i < 4; i++) perimeter += dfs(r + dr[i], c + dc[i], grid, dr, dc);
        return perimeter;
    }
}
