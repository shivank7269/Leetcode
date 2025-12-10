class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int max=0;
        for(int n:nums){
            if(n==1){
                maxCount++;
                max=Math.max(max,maxCount);
            }
            else{
                maxCount=0;
            }
        }
        return max;
    }
}