class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        if(nums.length < 3) return 0;
        
        for(int i=2;i<nums.length; i++){
            
            if((double)nums[i]+nums[i-2] == (double)nums[i-1]/2){
                count++;                
            }
        }        
        
        return count;
    }
}