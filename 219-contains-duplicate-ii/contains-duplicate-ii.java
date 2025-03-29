class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> win = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) win.remove(nums[i-k-1]);
            if(!win.add(nums[i])) return true;
        }
        return false;
    }
}