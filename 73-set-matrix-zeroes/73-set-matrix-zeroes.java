class Solution {
    
    public void mark0r(int [][] matrix, int r){
    
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
        
    }
    
    public void mark0c(int [][] matrix, int c){
    
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
        
    }
    
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean mat[][] = new boolean[n][m];
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0;i<n;i++){
                if(row[i]){
                    mark0r(matrix,i);
                }
        }
        for(int i=0;i<m;i++){
                if(col[i]){
                    mark0c(matrix,i);
                }
        }
        
        
    }
}