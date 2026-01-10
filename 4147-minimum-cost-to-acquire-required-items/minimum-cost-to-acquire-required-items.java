class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = (long)cost1*need1 + (long)cost2*need2;
        ans = Math.min(ans,(long)Math.max(need1,need2)*costBoth);
        ans= Math.min(ans,(long)Math.min(need1,need2)*costBoth+((need1>=need2)?(long)(need1-need2)*cost1:(long)(need2-need1)*cost2));
        return ans;
    }
}