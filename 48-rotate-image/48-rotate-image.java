class Solution {
    
    public void reverseRow(int[][] matrix, int r){
        int e = matrix.length - 1;
        int s = 0;
        while(s <= e){
            int temp = matrix[r][s];
            matrix[r][s] = matrix[r][e];
            matrix[r][e] = temp;
            s++; e--;
        }
    }
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        for(int i = 0; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i = 0 ; i < n ; i ++){
            reverseRow(matrix , i);
        }
        
    }
}