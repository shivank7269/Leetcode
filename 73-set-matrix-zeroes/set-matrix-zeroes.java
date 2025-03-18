class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] store = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0) store[i][j]=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(store[i][j]==1){
                    // for row
                    for(int k=0;k<m;k++){
                        matrix[i][k]=0;
                    }
                    //for col
                    for(int l=0;l<n;l++){
                        matrix[l][j]=0;
                    }
                }
            }
        }                                                                                                                                                                                                                                                                                                                                                                                                          
    }
}