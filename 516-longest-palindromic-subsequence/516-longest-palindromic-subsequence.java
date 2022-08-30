class Solution {
    
    public int solve(int i, int j, String s, String s2, int dp[][]){
        if(i==s.length() || j==s2.length()){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int max = -1;
        
        if(s.charAt(i)==s2.charAt(j)){
            max = Math.max(max,solve(i+1,j+1,s,s2,dp)+1);
        }
        else{
            max = Math.max(max,solve(i+1,j,s,s2,dp));
            max = Math.max(max,solve(i,j+1,s,s2,dp));
        }
        return dp[i][j] = max;
        
    }
    
    public int longestPalindromeSubseq(String s) {
        
        int n = s.length();

        String s2 = new StringBuilder(s).reverse().toString();
        
        int dp[][] = new int[n+1][n+1];
        
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        
        return solve(0,0, s, s2, dp);
        
    }
}