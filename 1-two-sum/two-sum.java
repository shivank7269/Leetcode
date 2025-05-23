class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumTarget = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numTarget = target-nums[i];
            if(sumTarget.containsKey(numTarget)){
                return new int[] {sumTarget.get(numTarget),i};
            }
            sumTarget.put(nums[i],i);
        }
        return null;
    }
}