class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, int[]> m = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (!m.containsKey(x)) {
                m.put(x, new int[]{i, -1, -1});
            } else {
                int[] a = m.get(x);

                if (a[1] == -1) {
                    a[1] = i;
                } else if (a[2] == -1) {
                    a[2] = i;
                    min = Math.min(min, 2 * (a[2] - a[0]));
                } else {
                    a[0] = a[1];
                    a[1] = a[2];
                    a[2] = i;
                    min = Math.min(min, 2 * (a[2] - a[0]));
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
