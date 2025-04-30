class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maj = nums.length/2;
        for(int i:nums){
            if(map.get(i)>maj) return i;
        } 
        return -1;
    }
}