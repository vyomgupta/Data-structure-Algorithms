class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length, m = matrix[0].length;
        
        int start = 0;
        int end   = n*m-1;
        
        while(start<=end){
            
            int mid = (start + end) / 2;
            
            int dr = mid/m;
            int dc = mid%m;
            if(matrix[dr][dc] == target){
                return true;
            }
            else if(matrix[dr][dc] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
        
    }
}