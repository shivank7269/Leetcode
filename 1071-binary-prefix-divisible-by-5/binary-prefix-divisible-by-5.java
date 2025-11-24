class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=(n*2+nums[i])%5;
            ans.add(n==0);
        }
        return ans;
    }
}

/*
011
decimale system = 3  3*10(decimal base 10)+4
binary system = 0  0*2+ 1 = ???
*/