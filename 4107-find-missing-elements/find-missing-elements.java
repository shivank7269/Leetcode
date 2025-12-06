class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=min;i<=max;i++){
            boolean found =false;
            for(int num:nums){
                if(num==i){
                    found =true;
                    break;
                }
            }
            if(!found) missing.add(i);
        }
        return missing;
    }
}