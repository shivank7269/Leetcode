class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int ansLength = numsLength*2;
        int[] ans = new int[ansLength]; 
        for(int i=0;i<numsLength;i++){
            ans[i] = nums[i];
            ans[i+numsLength] = nums[i];
        }
        return ans;
    }
}