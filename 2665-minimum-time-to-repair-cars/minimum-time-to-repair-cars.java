import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        // Edge case: If no cars need repairing, return 0
        if (cars == 0) return 0;

        // Find the smallest rank for initializing high
        int minRank = Arrays.stream(ranks).min().getAsInt();
        long low = 0;
        long high = (long) minRank * cars * cars; // Use long to avoid overflow
        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2; // Avoid overflow
            long sum = 0;

            // Calculate the total number of cars that can be repaired in 'mid' time
            for (int rank : ranks) {
                sum += Math.sqrt(mid / rank);
                if (sum >= cars) break; // No need to continue if we already reach the target
            }

            if (sum >= cars) {
                result = mid; // Mid is a possible solution
                high = mid - 1; // Look for a smaller time
            } else {
                low = mid + 1; // Increase the time to allow more cars to be repaired
            }
        }

        return result;
    }
}
