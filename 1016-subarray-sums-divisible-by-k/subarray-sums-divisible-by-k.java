class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> remainderCount = new HashMap<>();
        remainderCount.put(0,1);
        int prefixSum= 0, count=0;
        for(int num :nums){
            prefixSum+=num;
            int remainder = ((prefixSum %k )+ k)%k; // This deals with when rem is negative

            count+=remainderCount.getOrDefault(remainder,0);
            remainderCount.put(remainder,remainderCount.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}