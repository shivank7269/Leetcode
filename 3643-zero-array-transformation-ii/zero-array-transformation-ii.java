class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        int dec = 0, queryCount = 0;

        for (int i = 0; i < n; i++) {
            while (dec + diff[i] < nums[i]) {
                if (queryCount == queries.length) return -1;

                int start = queries[queryCount][0], end = queries[queryCount][1], value = queries[queryCount][2];
                queryCount++;

                if (end < i) continue;

                diff[Math.max(start, i)] += value;
                diff[end + 1] -= value;
            }
            dec += diff[i];
        }
        return queryCount;
    }
}
