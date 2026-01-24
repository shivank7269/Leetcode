class Solution {
    public String addBinary(String a, String b) {
        int lenA=a.length()-1;
        int lenB =b.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(lenA>=0 || lenB>=0 || carry!=0){
            int bitA = lenA>=0 ? a.charAt(lenA) - '0' : 0;
            int bitB = lenB>=0 ? b.charAt(lenB) - '0' :0;
            
            int sum = bitA+bitB+carry;
            sb.append(sum%2);
            carry = sum/2;
            lenA--;
            lenB--;
        }
        return sb.reverse().toString();
    }
}