class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if (nums.length % k != 0)
            return false;
        int numGroup = nums.length / k;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        for (int count : freq.values()) {
            if (count > numGroup)
                return false;
        }
        return true;
    }

}