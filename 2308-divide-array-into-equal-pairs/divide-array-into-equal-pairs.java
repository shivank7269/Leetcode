class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        for(int values:hm.values()){
            if(values%2!=0){
                return false;
            }
        }
        return true;
    }
}