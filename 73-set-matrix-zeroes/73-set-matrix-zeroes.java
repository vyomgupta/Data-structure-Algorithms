class Solution {
    
    public void mark0(int [][] matrix, int r, int c){
    
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
        
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean mat[][] = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    mat[i][j] = true;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==true){
                    mark0(matrix,i,j);
                }
            }
        }
        
        
        
    }
}