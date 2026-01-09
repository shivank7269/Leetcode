class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long individual = (long) need1 * cost1 + (long) need2 * cost2;
        int common = Math.min(need1, need2);
        long bothStrategy = 0;
        long effectiveBoth = Math.min((long) costBoth, (long) cost1 + cost2);
        bothStrategy += (long) common * effectiveBoth;
        if (need1 > need2) {
            bothStrategy += (long) (need1 - need2) * Math.min(cost1, costBoth);
        } else {
            bothStrategy += (long) (need2 - need1) * Math.min(cost2, costBoth);
        }
        return Math.min(individual, bothStrategy);
    }
}