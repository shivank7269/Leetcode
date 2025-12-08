class Solution {
    public int minOperations(String s) {
        int maxstep=0;
        for(char ch:s.toCharArray()){
            int k=(('a'-ch)+26)%26;
            maxstep=Math.max(maxstep,k);
        }
        return maxstep;
    }
    
}