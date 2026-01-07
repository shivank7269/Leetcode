class Solution {
    public String reversePrefix(String s, int k) {
    StringBuilder sb = new StringBuilder(s.substring(0, k));
    sb.reverse();
    sb.append(s.substring(k));// substring k to n 
    return sb.toString();
    }
}

