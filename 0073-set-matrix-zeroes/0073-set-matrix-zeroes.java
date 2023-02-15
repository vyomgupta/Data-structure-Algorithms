class Solution {
    
    public void fill1(int [][] matrix){ 
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
    }
    }     
    
    public void setZeroes(int[][] matrix) {
        boolean rflag = false;
        boolean cflag = false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == 0){
                    if(i==0){
                        rflag = true;
                    }
                    if(j==0){
                        cflag = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        fill1(matrix);
        
        if(cflag == true){
        for(int i=0;i<matrix.length;i++){
            matrix[i][0] =0;
        }
        }
        if(rflag == true){
        for(int i=0;i<matrix[0].length;i++){
            matrix[0][i] =0;
        }
        }
        
    }
}