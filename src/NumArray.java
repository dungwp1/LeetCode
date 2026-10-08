public class NumArray {
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        this.n = nums.length;
        tree = new int[nums.length * 4];
        buildTree(nums, 1, 0, n - 1);
    }

    public void update(int index, int val) {
        updateTree(1, 0, n - 1, index, val);
    }

    public int sumRange(int left, int right) {
        return sumTree(1, 0, n - 1, left, right);
    }

    private void buildTree(int[] nums, int i, int start, int end) {
        if (start == end) {
            tree[i] = nums[start];
            return;
        }
        int mid = start + (end - start) / 2;
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;
        buildTree(nums, leftChild, start, mid);
        buildTree(nums, rightChild, mid + 1, end);
        tree[i] = tree[leftChild] + tree[rightChild];
    }

    private void updateTree(int i, int start, int end, int index, int value) {
        if (start == end) {
            tree[i] = value;
            return;
        }
        int mid = start + (end - start) / 2;
        int childLeft = 2 * i;
        int childRight = 2 * i + 1;
        if (index <= mid) {
            updateTree(childLeft, start, mid, index, value);
        } else {
            updateTree(childRight, mid + 1, end, index, value);
        }
        tree[i] = tree[childLeft] + tree[childRight];
    }

    private int sumTree(int i, int start, int end, int left, int right) {
        if (right < start || end < left) return 0;
        if (left <= start && end <= right) return tree[i];
        int mid = start + (end - start) / 2;
        int childLeft = 2 * i;
        int childRight = 2 * i + 1;
        int leftResult = sumTree(childLeft, start, mid, left, right);
        int rightResult = sumTree(childRight, mid + 1, end, left, right);
        return leftResult + rightResult;
    }
}
