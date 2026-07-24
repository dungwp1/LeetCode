import java.util.ArrayList;
import java.util.List;

public class D98_1557_Minimum_Number_of_Vertices_to_Reach_All_Nodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] isChecked = new boolean[n];
        List<Integer> result = new ArrayList<>();

        
        for (List<Integer> edge : edges) {
            isChecked[edge.getLast()] = true;
        }
        for (int i = 0; i < isChecked.length; i++) {
            if (!isChecked[i]) result.add(i);
        }
        return result;
    }
}
