class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        long digits = 1;
        while(n>0){
            int rem = n%10;
            sum+=rem;           // 4 0 3
            if(rem!=0){        // 10203004
                x+=rem*digits; // 4 + 3 * 10
                digits=digits*10;    //100
            }
            n=n/10;
        }
        return sum*x;
        
    }
}