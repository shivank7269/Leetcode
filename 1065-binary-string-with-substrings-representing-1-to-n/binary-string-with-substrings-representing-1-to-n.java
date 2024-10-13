class Solution {

    static String binary(int n){
        
        StringBuilder s = new StringBuilder("");

        while(n>0){
            int r = n%2;
            s.insert(0,String.valueOf(r));
            n=n/2;
        }
        return s.toString();
    }
    public boolean queryString(String s, int n) {
        
        for(int i=1; i<=n; i++){
            String str = binary(i);
            int a = s.indexOf(str);
            if(a==-1) return false;
        }
        return true;
    }
}