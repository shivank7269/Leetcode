class Solution {
    public String largestEven(String s) {
        int l = s.lastIndexOf('2'); // 2 konse index pe hai akhri me
        if(l==-1) return "";       
        return s.substring(0,l+1);
    }
}