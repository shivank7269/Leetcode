import java.util.*;

class Solution {
    public int minLength(int[] nums, int k) {
        int n = nums.length;
        int minSize = Integer.MAX_VALUE;
        int left = 0;
        long currentSum = 0;
        Map<Integer, Integer> counts = new HashMap<>();

        for (int right = 0; right < n; right++) {
            int val = nums[right];
            counts.put(val, counts.getOrDefault(val, 0) + 1);
            if (counts.get(val) == 1) {
                currentSum += val;
            }
            while (currentSum >= k) {
                minSize = Math.min(minSize, right - left + 1);
                
                int leftVal = nums[left];
                counts.put(leftVal, counts.get(leftVal) - 1);
                if (counts.get(leftVal) == 0) {
                    currentSum -= leftVal;
                }
                left++;
            }
        }

        return minSize == Integer.MAX_VALUE ? -1 : minSize;
    }
}