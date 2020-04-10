class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<Math.floor(n/2); i++)
        {
            for(int j=i; j<n-i-1; j++)
            {
                int top = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-j-1][i] = matrix[n-1-i][n-1-j];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = top;
            }
        } 
    }
}