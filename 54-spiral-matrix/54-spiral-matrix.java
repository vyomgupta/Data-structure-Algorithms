class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        List<Integer> ans = new ArrayList<>();
        
        int idx = 0;
        
        int sr = 0;
        int sc = 0;
        int dr = n-1;
        int dc = m-1;
        
        int i = 0;
        
        while(idx < n*m){
            i = sc;
            while(i<=dc && idx < n*m){
                ans.add(matrix[sr][i]);
                i++;
                idx++;
            }
            sr++;
            
            i = sr;
            while(i<=dr&& idx < n*m){
                ans.add(matrix[i][dc]);
                i++;
                idx++;
            }
            dc--;
            
            i = dc;
            
            while(i>=sc&& idx < n*m){
                ans.add(matrix[dr][i]);
                i--;
                idx++;
            }
            dr--;
            
            i=dr;
            
            while(i>=sr&& idx < n*m){
                ans.add(matrix[i][sc]);
                i--;
                idx++;
            }
            sc++;
            
        }
        return ans;
    }
}