class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int circleIndex=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                circleIndex=i-1;
                break;
            }
        }
        if(circleIndex>=0){
            for(int i=n-1;i>0;i--){
                if(nums[i]>nums[circleIndex]){
                    swap(nums,i,circleIndex);
                    break;
                }
            }
        }
        reverse(nums,circleIndex+1,n-1);
    }
    private void swap(int[] nums ,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}