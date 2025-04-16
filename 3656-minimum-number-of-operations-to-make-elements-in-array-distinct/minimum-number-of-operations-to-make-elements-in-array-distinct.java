class Solution {
    public int minimumOperations(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = len-1; i >= 0 ; i--){       
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            if(mp.get(nums[i]) > 1){
                return i/3 + 1  ;
            }
        }
        return 0;
    }
}