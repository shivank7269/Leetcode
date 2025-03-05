class Solution {
    public int largestAltitude(int[] gain) {
        int altGain=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            gain[i]=sum;
            if(gain[i]>altGain){
                altGain=gain[i];
            }
        }
        return altGain;
    }
}