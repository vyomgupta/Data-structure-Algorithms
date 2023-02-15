class Solution {
    
    public void fillr(int [][] matrix, int row[]){ 
        for(int i=0;i<row.length;i++){
            if(row[i] == -1){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    public void fillc(int [][] matrix, int col[]){ 
        for(int i=0;i<col.length;i++){
            if(col[i] == -1){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
    
    public void setZeroes(int[][] matrix) {
        
        
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        fillr(matrix,row);
        fillc(matrix,col);
        
    }
}