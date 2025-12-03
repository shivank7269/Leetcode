class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);      
        String xs = "";                      
        for(char c:s.toCharArray()){       
            if(c!='0') xs=xs+c;
        }
        if(xs.equals("")) return 0;
        long x =Integer.parseInt(xs); 
        long sum=0;
        for(char c:xs.toCharArray()){
            sum+=c-'0'; 
        }
        long ans = x*sum;
        return ans;
    }
}