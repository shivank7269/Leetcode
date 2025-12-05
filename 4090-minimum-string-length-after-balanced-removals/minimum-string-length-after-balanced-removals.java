class Solution {
    public int minLengthAfterRemovals(String s) {
        // equal a and equal b return 0
        // if only a or only b return stirng length
        // unequal a and b return s.length - counta+countb
        // ""
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {      
            if (s.charAt(i) == 'a') countA++;
            else countB++;
        }
        return Math.abs(countA-countB);
    }

}