class Solution {
    
    public class pair{
        int r;
        int c;
        pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    
    
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int n = grid.length;
        int m = grid[0].length;
        Queue<pair> q = new ArrayDeque();
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                int val = grid[i][j];
                if(val == 1){
                    fresh++;
                }
                else if(val == 2){
                    q.add(new pair(i,j));
                }
            }
        }
        
        int dirs[][] = {{-1,0},{0,-1},{1,0},{0,1}};
        
        if(fresh == 0) return 0;
        
        int time = -1;
        
        while(q.size() > 0){
            int size = q.size();
            time++;
            for(int i = 0 ; i < size ; i ++){
                pair rem = q.remove();
                int r = rem.r;
                int c = rem.c;
                for(int dir[] : dirs){
                    int nr = r + dir[0];
                    int nc = c + dir[1];
                    if(nr >= 0 && nr < n && nc >=0 && nc < m && grid[nr][nc] == 1){
                         grid[nr][nc]=2;
                        q.add(new pair(nr,nc));
                       
                        fresh--;
                    }
                     if(fresh == 0) return time + 1;
                }

            }
            
        }
        return -1;
        
        
        
    }
}