class Solution {
    
    public int solve(int[][] obstacleGrid , int n, int m, int dp[][]){
        if(n < 0 || m < 0 || obstacleGrid[n][m] == 1){
            return 0;
        }
        
        if(n == 0 && m == 0){
            return 1;
        }
        if(dp[n][m]!=0){
            return dp[n][m];
        }
        int count = 0;
        
        count +=solve(obstacleGrid, n - 1, m, dp);
        count +=solve(obstacleGrid, n, m - 1, dp);
        
        return dp[n][m] =  count;
        
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        return solve(obstacleGrid, n - 1, m - 1, new int[n+1][m+1]);
    }
}
