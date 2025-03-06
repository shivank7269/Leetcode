class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        if(nums.length == 1){
            return (nums[0]==k)?1:0;
        }
        int prefix = 0;
        int count = 0;

        h.put(0,1);

        for(int i:nums){
            prefix+=i;
            if(h.containsKey(prefix-k)){
                count+=h.get(prefix-k);
            }
            h.put(prefix, h.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
