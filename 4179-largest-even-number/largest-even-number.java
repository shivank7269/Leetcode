class Solution {
    public String largestEven(String s) {
        int n = s.length();
        while(n>0 && s.charAt(n-1)!='2'){
            n--; 
        }
        return n==0 ? "" : s.substring(0,n);
    }
}