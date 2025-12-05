class Solution {
    public long countDistinct(long n) {
        String s = Long.toString(n);
        int m = s.length();

        long[] pow = new long[m + 1];
        pow[0] = 1;
        for (int i = 1; i <= m; i++) pow[i] = pow[i - 1] * 9;

        long ans = 0;
        for (int len = 1; len < m; len++) ans += pow[len];

        int i = 0;
        while (i < m) {
            char c = s.charAt(i);
            if (c == '0') break;
            int digit = c - '0';
            ans += (digit - 1) * pow[m - i - 1];
            i++;
        }

        return ans + (i == m ? 1 : 0);
    }
}