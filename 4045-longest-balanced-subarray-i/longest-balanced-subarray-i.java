class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> evenDistinct = new HashSet<>();
            Set<Integer> oddDistinct = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    evenDistinct.add(nums[j]);
                } else
                    oddDistinct.add(nums[j]);

                if (evenDistinct.size() == oddDistinct.size()) {
                    max = Math.max(max, j - i+1);
                }
            }
        }
        return max;
    }
}