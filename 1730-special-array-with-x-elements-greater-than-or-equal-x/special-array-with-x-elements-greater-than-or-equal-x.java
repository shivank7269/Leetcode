class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int[] res =new int[n+1];
        for (int i:nums){
            if(i>=nums.length){
                res[nums.length]++;
            }else{
                res[i]++;
            }
        }
        int total=0;
        for(int i=n;i>=0;i--){
            total+=res[i];
            if(total==i){
                return i;
            }
        }
        return -1;
    }
}