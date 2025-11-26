class Solution {
    public int removeDuplicates(int[] nums) {
        int n=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[n-1]){
                nums[n] =nums[i];
                n++;
            }
        }    
        return n;
    }
}