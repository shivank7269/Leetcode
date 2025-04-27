class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length; i++){
            if(i>1){
                if((double)nums[i]+nums[i-2]==(double)nums[i-1]/2){
                    count++;
                }
            }
        }
        
        
        return count;
    }
}