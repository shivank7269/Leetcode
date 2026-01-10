class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = (long) cost1 * need1 + (long) cost2 * need2;
        ans = Math.min(ans, (long) Math.max(need1, need2) * costBoth);
        
        long both1 = (long) Math.min(need1, need2) * costBoth;
        long rem = (need1 >= need2) ? (long) (need1 - need2) * cost1 : (long) (need2 - need1) * cost2;
        
        return Math.min(ans, both1 + rem);
    }
}