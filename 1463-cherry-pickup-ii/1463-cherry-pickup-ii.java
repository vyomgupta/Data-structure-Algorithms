class Solution {
    public int solve(int sr, int c1, int c2, int grid[][], int dp[][][]){
        
        if(sr == grid.length || c1 < 0 || c2 < 0 || c1 ==grid[0].length || c2 == grid[0].length ){
            return Integer.MIN_VALUE;
        }
        
        if(sr == grid.length - 1){
            if(c1 == c2){
                return grid[sr][c1];
            }
            else{
                return grid[sr][c1] + grid[sr][c2];
            }
        }
        
        if(dp[sr][c1][c2] != -1){
            return dp[sr][c1][c2];
        }
        int max = Integer.MIN_VALUE;
        
        max = Math.max(max,solve(sr + 1, c1, c2, grid, dp));
        max = Math.max(max,solve(sr + 1, c1, c2 - 1, grid, dp));
        max = Math.max(max, solve(sr + 1, c1, c2 + 1, grid, dp));
        max = Math.max(max,solve(sr + 1, c1 - 1, c2, grid, dp));
        max = Math.max(max, solve(sr + 1, c1 + 1, c2, grid, dp));
        max = Math.max(max, solve(sr + 1, c1 - 1, c2 - 1, grid, dp));
        max = Math.max(max, solve(sr + 1, c1 - 1, c2 + 1, grid, dp));
        max = Math.max(max,solve(sr + 1, c1 + 1, c2 - 1, grid, dp));
        max = Math.max(max, solve(sr + 1, c1 + 1, c2 + 1, grid, dp));
        
        if(c1 == c2){
            return dp[sr][c1][c2] = grid[sr][c1] + max;
        }
        else{
            return dp[sr][c1][c2] = grid[sr][c1] + grid[sr][c2] + max;
        }
        
    }
    
    
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int dp[][][] = new int[n][m][m];
        
        for(int arr[][] : dp){
            for(int a[] : arr){
                Arrays.fill(a, -1);
            }
        }
        
        return solve(0, 0, m - 1, grid, dp);
        
    }
}