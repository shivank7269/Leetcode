class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        if (nums.length == 0)
            return answer;

        int low = nums[0];
        int high = nums[0];
        for (int num : nums) {
            if (num < low) {
                low = num;
            }
            if (num > high) {
                high = num;
            }
        }
        boolean[] check = new boolean[high - low + 1];
        for (int num : nums) {
            check[num - low] = true;
        }
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                answer.add(i + low);
            }
        }
        return answer;
    }
}