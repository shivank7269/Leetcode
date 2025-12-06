class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0;
        List<Integer> num = new ArrayList<>();
        for (int n : nums) {
            num.add(n);
        }
        for (int i = nums[0]; i < nums[nums.length - 1]; i++) {
            if (!num.contains(i))
                lst.add(i);
        }
        return lst;
    }
}