import java.util.ArrayList;
import java.util.List;

public class D90_77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int n, int k, List<Integer> combination, List<List<Integer>> result) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = n; i > 0; i--) {
            combination.add(i);
            backtrack(i - 1, k, combination, result);
            combination.removeLast();
        }
    }
}
