class Solution {
    public int countElements(int[] nums,int k) {
        Arrays.sort(nums);
        int count=0;                       
        int n=nums.length;
        if(k==0) return n;
        for(int i=0;i<n;i++){
            if(nums[n-k] > nums[i]) count++;
        }
        return count;
    }
}