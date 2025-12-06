class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101 , max = 0 ;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        Set<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            set.add(num);
        }
        List<Integer> res = new ArrayList<>();

        for(int i = min+1 ; i < max ; i++)
        {
            if(!set.contains(i))
            {
               res.add(i);
            }
        }

        return res;
    }
}