public class Solution {
    public static int sumSubarrayMins(int[] arr) {
        int mod = 1000000007; // Modulo value
        int n = arr.length;

        // Arrays to store the previous and next smaller elements
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Initialize previous smaller elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Initialize next smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate sum of subarray minimums
        long result = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prevSmaller[i];
            long right = nextSmaller[i] - i;
            result += (long) arr[i] * left * right;
            result %= mod;
        }

        return (int) result;
    }
}