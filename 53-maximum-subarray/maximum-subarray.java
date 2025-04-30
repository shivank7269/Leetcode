class Solution {
    public int maxSubArray(int[] nums) {
        int curr=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr = Math.max(curr+nums[i],nums[i]);
            max = Math.max(max,curr);
        }
        return max;
    }
}