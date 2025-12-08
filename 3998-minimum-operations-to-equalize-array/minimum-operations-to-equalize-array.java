class Solution {
    public int minOperations(int[] nums) {
        boolean equal=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                equal=false;
                break;
            }
        }
        return equal ? 0:1;
        
    }
}