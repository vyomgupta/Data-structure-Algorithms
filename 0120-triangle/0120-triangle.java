class Solution {
    public int solve(List<List<Integer>> triangle, int i, int j, int dp[][]){
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != (int)Math.pow(10,9)){
            return dp[i][j];
        }
        int min = (int)Math.pow(10,9);
        if(i + 1 < triangle.size()){
            min = Math.min(min, solve(triangle, i + 1, j, dp) + triangle.get(i).get(j));
        }
        if(i + 1 < triangle.size() && j + 1 < triangle.get(i + 1).size()){
            min = Math.min(min, solve(triangle, i + 1, j + 1, dp)+ triangle.get(i).get(j));
        }
        
        return dp[i][j] = min;
        
        
        
        
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int dp[][] = new int[n][n];
        for(int row[] : dp)
            Arrays.fill(row,(int)Math.pow(10,9));
        
        
        for(int i = n - 1; i >= 0 ; i --){
            for(int j = 0 ; j < triangle.get(i).size() ; j ++){
                if(i == n - 1){
                    dp[i][j] = triangle.get(i).get(j);
                }
                else{
                    int min = 100000;
                    min = Math.min(dp[i + 1][j] + triangle.get(i).get(j), min);
                    min = Math.min(dp[i + 1][j + 1] + triangle.get(i).get(j), min);
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][0];
        
    }
}