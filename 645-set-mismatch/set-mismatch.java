class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] freq = new int[nums.length+1];
        for(int n : nums){
            freq[n]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(freq[i] == 2) ans[0] = i;
            else if(freq[i] == 0) ans[1] = i;
        }
        return ans;
    }
}