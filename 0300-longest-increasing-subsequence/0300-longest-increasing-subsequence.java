class Solution {
    public int lengthOfLIS(int[] a) {
        int n = a.length;
        int[][] dp=new int[n][n+1];
        for(int[] row: dp) Arrays.fill(row,-1);
        return help(0,-1,a,dp);
    }
    public static int help(int i, int prev, int[] a,int[][] dp){
        if(i == a.length) return 0;
        
        if(dp[i][prev+1] != -1) return dp[i][prev+1];
        
        int notPick = help(i+1,prev,a,dp);
        int pick = 0;
        if(prev == -1 || a[i] > a[prev]){
            pick = 1 + help(i+1,i,a,dp);
        }
        return dp[i][prev+1] = Math.max(pick,notPick);
    }
}