class NumMatrix {
    private int[][] sum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] + matrix[i - 1][j - 1] - sum[i-1][j-1];
            }
        }
    }
    public int sumRegion(int x1, int y1, int x2, int y2) {
        return sum[x2+1][y2+1] - sum[x1][y2+1] - sum[x2+1][y1] + sum[x1][y1];
    }
}