class Solution {
    
    public void dfs(int[][] grid, int row, int col, boolean[][] visited){
        
        if(row >= grid.length || row < 0 || col>= grid[0].length || col < 0 || grid [row][col] == 0 ){
            return;
        }
        grid[row][col] = 0;
         dfs(grid, row - 1, col, visited);
         dfs(grid, row, col - 1, visited);
         dfs(grid, row + 1, col, visited);
         dfs(grid, row , col + 1, visited);
    }
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j++){
                if( i == 0 || i == n -1 || j == 0 || j == m - 1 ){
                    dfs(grid, i, j, new boolean[n][m]);
                }
            }
        }
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1){
                    count ++;
                }
            }
        }
        
        
        return count;
        
    }
}