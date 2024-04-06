import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumTarget =  new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remTarget = target - nums[i];
            if (sumTarget.containsKey(remTarget)) {
                return new int[]{sumTarget.get(remTarget), i};
            }
            sumTarget.put(nums[i], i);
        }
        return null;
    }
}