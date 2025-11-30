class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int freq=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] ==nums[j]) freq++;
            }
            if(freq%k == 0) sum+=nums[i];
        }
        return sum;
    }
}