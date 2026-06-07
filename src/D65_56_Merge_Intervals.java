import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D65_56_Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            if (currentStart > end) {
                int[] element = {start, end};
                result.add(element);
                start = currentStart;
                end = currentEnd;
            } else if (currentEnd > end) {
                end = currentEnd;
            }
        }
        int[] element = {start, end};
        result.add(element);
        return result.toArray(new int[result.size()][]);
    }
}
