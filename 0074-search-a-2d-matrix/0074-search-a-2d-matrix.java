class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int s = 0;
        int e = (n * m) - 1;
        
        while(s <= e){
            int mid = s + (e - s)/2;
            int r = mid / m;
            int c = mid % m;
            if(matrix[r][c] < target){
                s = mid + 1;
            }
            else if(matrix[r][c] > target){
                e = mid - 1;
            }
            else{
                return true;
            }
            
        }
        return false;
        
    }
}