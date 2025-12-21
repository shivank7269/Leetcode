class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int k=n;
        while(k>0){
            rev=rev*10+k%10;
            k/=10;
        }
        return Math.abs(n-rev);
    }
}