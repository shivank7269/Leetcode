class Solution {
    public double pow(double x, long n) {
        if(n==0){
            return 1;
        }
        double half = pow(x,n/2);
        double res = half*half;
        if(n%2==1){
            return x*res;
        }
        return res;
    }
    public double myPow(double x, int n){
        if(n<0){
            long m = -(long)n;
            return 1/pow(x,m);
        }else{
            return pow(x,n);
        }
    }
}