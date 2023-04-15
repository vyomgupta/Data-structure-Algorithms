class Solution {
    
    public int solve(int n, int m, int matrix[][], int dp[][]){
        
        if(n == 0){
            return matrix[0][m];
        }
        if(dp[n][m] != 1000000) return dp[n][m];
        
        int min = Integer.MAX_VALUE;
        if(n - 1 >= 0)
            min = Math.min(min,solve(n - 1, m, matrix, dp));
            
        if(n - 1 >= 0 && m - 1 >=0)
            min = Math.min(min,solve(n - 1, m - 1, matrix, dp));
        
        if(n - 1 >= 0 && m + 1 < matrix[0].length)
            min = Math.min(min,solve(n - 1, m + 1, matrix, dp));
        
        return dp[n][m] = matrix[n][m] + min;


    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < m ; i ++){
            int dp[][] = new int[n][m];
            for(int row[] : dp)
                Arrays.fill(row, 1000000);
            int cal = solve(n - 1, i, matrix, dp);
            min = Math.min(min, cal);
        }
        return min;
        
    }
}