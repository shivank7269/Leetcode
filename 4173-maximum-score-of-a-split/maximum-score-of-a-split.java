class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        long[] prefixSum = new long[n];
        int[] suffixMin = new int[n];
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }

        int min = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suffixMin[i] = min;
        }

        long max = Long.MIN_VALUE; 
        for (int i = 0; i < n - 1; i++) {
            long score = prefixSum[i] - suffixMin[i + 1];
            max = Math.max(max, score);
        }
        return max;
    }
}