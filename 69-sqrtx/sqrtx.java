class Solution {
    public int mySqrt(int x) {
        int a=0;
        while((long)a*a<=x){
            a++;
        }
    return a-1;
    } 
}