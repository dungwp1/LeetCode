public class D71_932_Beautiful_Array {
    public int[] beautifulArray(int n) {
        if (n == 1) return new int[]{1};
        int odd = (n + 1) / 2;
        int even = n / 2;
        int[] aodd = beautifulArray(odd);
        int[] aeven = beautifulArray(even);
        int[] result = new int[aodd.length + aeven.length];
        int index = 0;
        for (int x : aodd) {
            result[index] = 2 * x - 1;
            index++;
        }
        for (int x : aeven) {
            result[index] = 2 * x;
            index++;
        }
        return result;
    }
}
