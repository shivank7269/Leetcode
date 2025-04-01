class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int left = 1, right = position[position.length - 1] - position[0];
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isFeasible(position, m, mid)) {
                result = mid; // Update result
                left = mid + 1; // Try for larger distances
            } else {
                right = mid-1; // Try for smaller distances
            }
        }
        
        return result;
    }
    
    private static boolean isFeasible(int[] position, int m, int distance) {
        int count = 1; // Place the first ball
        int lastPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= distance) {
                count++;
                lastPosition = position[i];
                if (count == m) {
                    return true;
                }
            }
        }
        
        return false;
    }
}