class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=countNegativeNumber(grid[i]);
        }
        return count;
    }
     public int countNegativeNumber(int[] grid){
        int start=0;
        int end = grid.length;
        while(start<end){
            int mid = start +(end-start)/2;
            if(grid[mid]<0){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return grid.length-start;
     }
}