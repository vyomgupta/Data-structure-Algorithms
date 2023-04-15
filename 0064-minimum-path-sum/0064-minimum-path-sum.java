class Solution 
{
    

    public int minSumPath(int n, int m, int[][] matrix){
    
    int dp[][]=new int[n][m];
    
    for(int i=0; i<n ; i++){
        for(int j=0; j<m; j++){
            if(i==0 && j==0) dp[i][j] = matrix[i][j];
            else{
                    
              int min = Integer.MAX_VALUE;
  if(i > 0 ){
      min = Math.min(min, matrix[i][j]+dp[i - 1][j]);
  }
  if(j > 0){
      min = Math.min(min,matrix[i][j]+dp[i][j - 1]);
  
  }
                dp[i][j] = min;
            }
        }
    }
    
    return dp[n-1][m-1];
    
}
        
    public int minPathSum(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
         return minSumPath(n, m, grid);
       
		}
    
}