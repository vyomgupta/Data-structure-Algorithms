class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        
        int sc = 0;
        int sr = 0;
        int ec = m - 1;
        int er = n - 1;
        int count = 0;
        
        
        while(count < m*n){
            
            
            for(int i = sc ; i <= ec && count < n*m ; i ++){
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;
            
            for(int i = sr ; i <=er && count < n*m ; i ++){
                ans.add(matrix[i][ec]);
                count++;
            }
            ec--;
            
            for(int i = ec ; i >= sc && count < n*m ; i --){
                ans.add(matrix[er][i]);
                count++;
            }
            er--;
            
            for(int i = er ; i >= sr && count < n*m ; i --){
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;
                        
            
        }
        
        return ans;
        
        
    }
}