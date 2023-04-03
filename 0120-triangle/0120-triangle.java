class Solution {
    
    public int solve(List<List<Integer>> triangle, int row, int col, int dp[][]){
        if(row == triangle.size()){
            return 0;
        }
        if(dp[row][col] != Integer.MIN_VALUE){
            return dp[row][col];
        }
        int min = Integer.MAX_VALUE;
        
        min = Math.min(min, solve(triangle, row + 1, col, dp));
        min = Math.min(min, solve(triangle, row + 1, col + 1, dp));
        
        return dp[row][col] = min + triangle.get(row).get(col);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int dp[][] = new int[n][n];
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return solve(triangle, 0, 0, dp);
    }
}