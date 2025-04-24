public class Solution {
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        long totalSum = 0;

        // Iterate through all subarrays
        for (int i = 0; i < n; i++) {
            int currMin = Integer.MAX_VALUE;
            int currMax = Integer.MIN_VALUE;

            for (int j = i; j < n; j++) {
                // Update min and max for the current subarray
                currMin = Math.min(currMin, nums[j]);
                currMax = Math.max(currMax, nums[j]);

                // Add the range (max - min) to the total sum
                totalSum += (currMax - currMin);
            }
        }

        return totalSum;
    }
}