class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        pre[0] = nums[0];
        post[nums.length-1] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i] = nums[i]+pre[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            post[i] = nums[i]+post[i+1];
        }
        for(int i =0 ;i<nums.length;i++){
            if(pre[i] == post[i]){
                return i;
            }
        }
        return -1;
    }
}