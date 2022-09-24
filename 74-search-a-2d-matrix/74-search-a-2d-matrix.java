class Solution {
    
    public boolean searchMatrix_BinarySearch(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;

        int lo = 0, hi = rows * cols - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int num = matrix[mid / cols][mid % cols];
            if (num == target) return true;
            else if (num < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return searchMatrix_BinarySearch(matrix,target);
        
    }
}