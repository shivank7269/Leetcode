class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i : nums) {
            if (i >= 0)
                pos.add(i);
            else
                neg.add(i);
        }
        int ind = 0;
        for (int i = 0; i < pos.size(); i++) {
            nums[ind++] = pos.get(i);
            nums[ind++] = neg.get(i);
        }
        return nums;
    }
}