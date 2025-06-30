class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int gasSum = 0;
        int costSum =0;

        for(int i=0;i<n;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(gasSum < costSum) return -1;

        int curr =0;
        int start = 0;

        for(int i=0;i<n;i++){
            curr += gas[i] - cost[i];
            if(curr < 0){
                curr =0;
                start = i+1;
            } 
        }
        return start;
    }
}