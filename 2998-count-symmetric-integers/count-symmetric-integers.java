class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String number = String.valueOf(i);
            if(number.length()%2==0){
                int n = number.length()/2;
                String firstHalf = number.substring(0,n);
                String secondHalf = number.substring(n);
                if(countSum(firstHalf)==countSum(secondHalf)){
                    count++;
                }
            }
        }
        return count;
    }
    public int countSum(String n){
        int sum = 0;
        for(char c : n.toCharArray()){
            sum+=c-'0';
        }
        return sum;
    }
}