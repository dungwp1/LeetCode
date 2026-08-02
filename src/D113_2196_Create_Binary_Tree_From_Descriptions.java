import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D113_2196_Create_Binary_Tree_From_Descriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
//        left = 1, right = 0;
        Set<Integer> childSet = new HashSet<>();
        Map<Integer, TreeNode> map = new HashMap<>();
        TreeNode root = new TreeNode();
        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            int isLeft = description[2];
            if (!map.containsKey(parentVal)) map.put(parentVal, new TreeNode(parentVal));
            if (!map.containsKey(childVal)) map.put(childVal, new TreeNode(childVal));
            childSet.add(childVal);
            if (isLeft == 1) {
                map.get(parentVal).left = map.get(childVal);
            } else {
                map.get(parentVal).right = map.get(childVal);
            }
        }
        for (int[] description : descriptions) {
            if (!childSet.contains(description[0])) root = map.get(description[0]);
        }
        return root;
    }
}
