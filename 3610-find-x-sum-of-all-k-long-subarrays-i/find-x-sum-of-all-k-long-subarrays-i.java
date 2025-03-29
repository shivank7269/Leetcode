class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];

        for(int i=0;i<=n-k;i++){
            int[] sub = Arrays.copyOfRange(nums,i,i+k);
            ans[i]=calc(sub,x);
        }
        return ans;
    }
    private int calc(int[] arr,int x){
        Map<Integer,Integer> fm = new HashMap<>();
        for(int i:arr){
            fm.put(i,fm.getOrDefault(i,0)+1);
        } 
        List<Map.Entry<Integer,Integer>> list = new ArrayList(fm.entrySet());
        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue();
            }else{
                return b.getKey()-a.getKey();
            }
        });

        int sum=0;
        int count=0;
        for(Map.Entry<Integer,Integer> ent : list){
            if(count >=x)break;
            sum+=ent.getKey()*ent.getValue();
            count++;
        }
        return sum;
    }
}