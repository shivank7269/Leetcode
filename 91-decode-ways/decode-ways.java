class Solution {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
        
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 

        for (int i = 2; i <= n; i++) {
            char curr = s.charAt(i - 1);
            char prev = s.charAt(i - 2);
            
            if (curr != '0') {
                dp[i] = dp[i - 1];
            }
            
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
            
            if (dp[i] == 0) return 0;
        }
        
        return dp[n];
    }
    
}