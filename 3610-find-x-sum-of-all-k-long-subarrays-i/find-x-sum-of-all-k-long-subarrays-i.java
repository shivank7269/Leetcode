class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length; // Get the length of the input array `nums`
        int[] ans = new int[n-k+1]; // Initialize the result array to store sums for each subarray of length `k`

        // Iterate over all possible subarrays of size `k`
        for(int i=0; i<=n-k; i++){
            // Create a subarray of length `k` from the current index `i`
            int[] sub = Arrays.copyOfRange(nums, i, i+k); 
            ans[i] = calc(sub, x); // Pass the subarray and `x` to the helper method `calc` to compute the sum
        }
        return ans; // Return the result array
    }

    private int calc(int[] arr, int x) {
        Map<Integer, Integer> fm = new HashMap<>(); // Create a frequency map to count occurrences of each element in `arr`
        for (int i : arr) {
            fm.put(i, fm.getOrDefault(i, 0) + 1); // Update the frequency map with counts of each element
        }

        // Convert the frequency map entries to a list of `Map.Entry<Integer, Integer>`
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(fm.entrySet());

        // Sort the list of entries based on the values (frequency) and keys (element value)
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) { // If the frequencies are not equal
                return b.getValue() - a.getValue(); // Sort in descending order of frequency
            } else {
                return b.getKey() - a.getKey(); // If frequencies are equal, sort in ascending order of the element value
            }
        });

        int sum = 0; // Initialize the sum
        int count = 0; // Count of elements added to the sum
        // Add the `x` most frequent elements to the sum
        for (Map.Entry<Integer, Integer> ent : list) {
            if (count >= x) break; // Stop if `x` elements have been processed
            sum += ent.getKey() * ent.getValue(); // Add the product of the element and its frequency to the sum
            count++; // Increment the count of elements added
        }
        return sum; // Return the calculated sum
    }
}
