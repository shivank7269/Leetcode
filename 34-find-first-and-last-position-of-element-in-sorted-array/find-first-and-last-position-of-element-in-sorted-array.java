class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        res[0] = first;
        res[1] = last;
        return res;
    }

    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1, index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}
