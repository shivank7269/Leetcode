class Solution {
    List<List<Integer>> powerset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        pset(nums, 0, current);
        return powerset;
    }

    private void pset(int[] nums, int i, List<Integer> current) {
        if (i == nums.length) {
            powerset.add(new ArrayList<>(current));
            return;
        }

    
        current.add(nums[i]);
        pset(nums, i + 1, current);

    
        current.remove(current.size() - 1);
        pset(nums, i + 1, current);
    }
}