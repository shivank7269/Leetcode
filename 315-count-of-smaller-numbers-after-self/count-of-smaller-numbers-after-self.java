class Solution {

    static final int OFFSET = 10001;           // To shift negative values to positive indices
    static final int SIZE = 2 * OFFSET + 2;    // Total size of BIT

    static class FenwickTree {
        int[] tree = new int[SIZE];

        void update(int i, int delta) {
            while (i < SIZE) {
                tree[i] += delta;
                i += (i & -i);
            }
        }

        int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= (i & -i);
            }
            return sum;
        }
    }

    public static List<Integer> countSmaller(int[] nums) {
        FenwickTree bit = new FenwickTree();
        Integer[] result = new Integer[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int mappedIndex = nums[i] + OFFSET;
            result[i] = bit.query(mappedIndex - 1);
            bit.update(mappedIndex, 1);
        }

        return Arrays.asList(result);
    }
}