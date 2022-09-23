class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int r = 0;
        int c = m-1;
        
        while(c>=0 && r<n){
            
            int val = matrix[r][c];
            
            if(val==target){
                return true;
            }
            else if(val>target){
                c--;
            }
            else{
                r++;
            }
            
        }
        return false;
        
        
    }
}