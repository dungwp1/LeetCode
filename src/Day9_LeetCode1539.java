public class Day9_LeetCode1539 {
    public static int findKthPositive(int[] arr, int k) {
        int max = arr[arr.length - 1];
        int nLoop = Math.max(max, arr.length + k);
        int[] missingArr = new int[k];
        int iM = 0;
        int iA = 0;
        for (int i = 1; i <= nLoop; i++) {
            if (missingArr[k - 1] != 0) break;
            if (iA == arr.length) {
                for (int item : missingArr) {
                    if (item == 0) {
                        missingArr[iM] = i;
                        i++;
                        iM++;
                    }
                }
                return missingArr[k - 1];

            } else if (i != arr[iA]) {
                missingArr[iM] = i;
                iM++;
            } else {
                iA++;
            }
        }
        return missingArr[k - 1];
    }
}
