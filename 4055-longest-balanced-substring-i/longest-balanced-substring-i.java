class Solution {
    public int longestBalanced(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            int ds=0;
            int mf=0;
            for(int j=i;j<s.length();j++){
                int idx = s.charAt(j)-'a';
                if(freq[idx] == 0) ds++; 
                freq[idx]++;
                mf = Math.max(mf,freq[idx]);
                int currentLength = j - i + 1;
                if(ds*mf == currentLength){
                    maxLength = Math.max(maxLength,currentLength);
                }
                
            }
            
        }
       return maxLength;
    }
}