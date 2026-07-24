public class D97_2076_Process_Restricted_Friend_Requests {
    public static boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int index = 0;
        boolean[] result = new boolean[requests.length];

        for (int[] request : requests) {
            int rootU = find(request[0], parent);
            int rootV = find(request[1], parent);

            if (rootU == rootV) {
                result[index] = true;
                index++;
                continue;
            }

            boolean isAccepted = true;
            for (int[] restriction : restrictions) {
                int rootX = find(restriction[0], parent);
                int rootY = find(restriction[1], parent);
                if ((rootU == rootX && rootV == rootY) || (rootU == rootY && rootV == rootX)) {
                    result[index] = false;
                    isAccepted = false;
                    break;
                }
            }
            if (isAccepted) {
                union(request[0], request[1], parent);
                result[index] = true;
            }
            index++;
        }
        return result;
    }

    private static int find(int num, int[] parent) {
        if (parent[num] == num) return num;
        return parent[num] = find(parent[num], parent);
    }

    private static void union(int num1, int num2, int[] parent) {
        int rootI = find(num1, parent);
        int rootJ = find(num2, parent);
        if (rootI != rootJ) {
            parent[rootI] = rootJ;
        }
    }
}
