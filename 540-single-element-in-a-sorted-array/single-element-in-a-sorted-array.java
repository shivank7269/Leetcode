class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
        return nums[0];
        for(int i=1;i<nums.length;i=i+2){
            if(nums[i]!=nums[i-1])
            return nums[i-1];
        }
        if(nums[nums.length-1]!=nums[nums.length-2])
        return nums[nums.length-1];
        return -1;
    }
}