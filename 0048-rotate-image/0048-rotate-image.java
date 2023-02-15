class Solution {
    
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void rotate(int[][] matrix) {
        
        
        for(int i = 0 ; i < matrix.length ; i ++){
            for(int j = i ; j < matrix.length ; j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i = 0 ; i < matrix.length ; i++){
            int s = 0; int e = matrix[0].length - 1;
            while(s <= e){
                swap(matrix[i],s++,e--);
            }
        }
        
        
    }
}