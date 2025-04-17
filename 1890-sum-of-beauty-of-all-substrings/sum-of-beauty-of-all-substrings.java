class Solution {
    public int beautySum(String s) {
        char[] arr = s.toCharArray();
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            int max = 0;

            for (int j = i; j < s.length(); j++) {
                count[arr[j] - 'a']++;
                int min = Integer.MAX_VALUE;
                max = Math.max(max, count[arr[j] - 'a']);

                for (int k = 0; k < 26; k++) {
                    if (count[k] > 0) {
                        min = Math.min(min, count[k]);
                    }
                }

                res += (max - min);
            }
        }

        return res;
    }
}