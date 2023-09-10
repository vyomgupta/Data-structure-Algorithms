class Solution {
    
    public void solve(int i, int j, char grid[][]){
        
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '2' || grid[i][j] == '0') return;
        
        grid[i][j] = '2';
        solve(i - 1, j, grid);
        solve(i,j - 1, grid);
        solve(i + 1, j, grid);
        solve(i, j + 1, grid);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                if(grid[i][j] == '1'){
                    solve(i, j, grid);
                    count++;
                }
            }
        }
        
        return count;
    }
}