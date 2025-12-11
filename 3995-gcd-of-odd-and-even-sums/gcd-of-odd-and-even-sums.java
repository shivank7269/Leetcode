class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOfOdd = 0;
        int sumOfEven =0;
        for(int i=1;i<=n;i++){
            sumOfOdd+=2*i-1;
            sumOfEven+=2*i;
        }
        
        return gcd(sumOfOdd,sumOfEven);
    }
    public int gcd(int a , int b){
        int result = Math.min(a,b);
        while(result > 0){
            if(a%result==0 && b%result==0) break;
            result--;
        }
        return result;
    }
}