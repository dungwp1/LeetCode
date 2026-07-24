import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D96_952_Largest_Component_Size_by_Common_Factor {
    public static int largestComponentSize(int[] nums) {
        int count = 0;
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        int[] parents = new int[maxVal + 1];
        int[] counts = new int[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) {
            parents[i] = i;
        }

        for (int num : nums) {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    union(num, i, parents);
                    if (i != num / i) {
                        union(num, num / i, parents);
                    }
                }
            }
        }
        for (int num : nums) {
            int root = find(num, parents);
            counts[root]++;
            count = Math.max(count, counts[root]);
        }
        return count;
    }


    private static void union(int num, int uoc, int[] parents) {
        int RootI = find(num, parents);
        int RootJ = find(uoc, parents);
        if (RootI != RootJ) {
            parents[RootI] = RootJ;
        }
    }

    private static int find(int num, int[] parents) {
        if (parents[num] == num) return num;
        int root = parents[num];
        parents[num] = find(root, parents);
        return parents[num];
    }
}
