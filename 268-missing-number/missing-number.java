class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int currSum = 0;
        for(int i=0;i<n;i++){
            currSum = currSum+nums[i];
        }
        return totalSum-currSum;
    }
}