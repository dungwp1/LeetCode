public class D88_1545_Find_Kth_Bit_in_Nth_Binary_String {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int mid = 1 << (n - 1);
        if (k == mid) return '1';
        if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            int newK = (1 << n) - k;
            char result = findKthBit(n - 1, newK);
            return result == '1' ? '0' : '1';
        }
    }
}
