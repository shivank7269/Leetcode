class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currentMaxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMinSum = 0;
        int totalSum = 0;   
        for (int i = 0; i < n; i++) {
            currentMaxSum += nums[i];
            if (currentMaxSum > maxSum) {
                maxSum = currentMaxSum;
            }
            if (currentMaxSum < 0) {
                currentMaxSum = 0;
            }
            currentMinSum += nums[i];
            if (currentMinSum < minSum) {
                minSum = currentMinSum;
            }
            if (currentMinSum > 0) {
                currentMinSum = 0;
            }
            totalSum += nums[i];
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}
