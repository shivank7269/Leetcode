class Solution {
    public char repeatedCharacter(String s) {
        for(int i=1;i<s.length();i++){
            /*
            "abccbaacz"
            i=1 b 
                j=0 b==a ? false
            i=2 c
                j=0 c==a ? false c==b ? false
            i=3 c
                j=0 c==a ? false c==b ? false c==c ? true return 
             */ 
             for(int j=0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return ' ';
    }
}