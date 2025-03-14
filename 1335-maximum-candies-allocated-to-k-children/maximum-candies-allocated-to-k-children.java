class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int min = 1;

        for (int candy : candies) {
            sum += candy;
        }
        
        if (sum < k) {
            return 0;
        }

        int max = (int) (sum / k);
        while (min <= max) {
            int mid = (min + max) / 2;
            if (checkValid(candies, mid, k)) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return max;
    }
        public boolean checkValid(int[] candies, int val, long m) {
        long count = 0;
        for (int candy : candies) {
            count += candy / val;
        }
        return count >= m;
    }

}
