class Solution {
    public int mySqrt(int x) {
        return sqrt(x); 
    }
    public static int sqrt(int n){
        double x=n ,tol=0.00001;
        while(Math.abs(x-n/x)>tol){
            x=(x+n/x)/2;
        }
        return (int) x;
    }
}