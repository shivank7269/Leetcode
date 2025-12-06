class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();   
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        for (int i = min; i <= max; i++) {
            boolean isfound = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    isfound = true;
                    break;
                }
            }
            if (!isfound) {
                list.add(i);
            }
        }

        return list;
    }
}