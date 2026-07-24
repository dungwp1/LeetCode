import java.util.*;

public class D99_2508_Add_Edges_to_Make_Degrees_of_All_Nodes_Even {
    public static boolean isPossible(int n, List<List<Integer>> edges) {
        Set<Integer>[] adj = new HashSet[n + 1];
        for (int i = 1; i < adj.length; i++) {
            adj[i] = new HashSet<>();
        }

        for (List<Integer> edge : edges) {
            int n1 = edge.getFirst();
            int n2 = edge.getLast();
            adj[n1].add(n2);
            adj[n2].add(n1);
        }

        List<Integer> nodeOdd = new ArrayList<>();
        for (int i = 1; i < adj.length; i++) {
            if (adj[i].size() % 2 != 0) nodeOdd.add(i);
        }

        if (nodeOdd.isEmpty()) return true; // không có node bậc lẻ -> true
        if (nodeOdd.size() % 2 != 0) return false; // có số node bậc lẻ là lẻ -> false
//        có 2 node bậc lẻ
        if (nodeOdd.size() == 2) {
            int node1 = nodeOdd.getFirst();
            int node2 = nodeOdd.getLast();
            if (!adj[node1].contains(node2))
                return true; // có cạnh chung -> nối được -> true
//            check trường hợp không trùng
//            b1: tìm node3 chưa liên kết với node1 và node2
            for (int i = 1; i < adj.length; i++) {
                if (i == node1 || i == node2) continue;
                if (!adj[i].contains(node1) && !adj[i].contains(node2)) return true;
            }
            return false;
        }
//        có 4 node bậc lẻ
        if (nodeOdd.size() == 4) {
            int node1 = nodeOdd.get(0);
            int node2 = nodeOdd.get(1);
            int node3 = nodeOdd.get(2);
            int node4 = nodeOdd.get(3);
//                        vì chỉ được nối 2 lần => bắt buuộc 4 node phải nối được với nhau -> true
            if (!adj[node1].contains(node2) && !adj[node3].contains(node4)) return true;
            if (!adj[node1].contains(node3) && !adj[node2].contains(node4)) return true;
            if (!adj[node1].contains(node4) && !adj[node2].contains(node3)) return true;
            return false;
        }
        return false;
    }
}
