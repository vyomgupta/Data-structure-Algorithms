class Solution {
	public int f(int i,int sum){
		if(i==1) return 1; 
		int notpick=f(i-1,sum);
		int pick=0;
		if(sum>=i) pick=i*f(i,sum-i);
		return Math.max(pick,notpick);
	}

    public int solve(int i, int dp[][], int n){
        if(n==0 || i==n){
            return 0;
        }
        // if(i==n){
        //     return Integer.MIN_VALUE;
        // }
        
        
        int max=Integer.MIN_VALUE;
        if(n-i>=0){
           int mult= solve(i,dp,n-i);
            if(mult==0){
                mult=1*i;
            }
            else{
                mult=mult*i;
            }
            
            max = Math.max(mult,max);
           // max=Math.max(max,solve(i,dp,n-i)+i);
            max=Math.max(max,solve(i+1,dp,n));
        }
        
        
        return max;
    }
    public int integerBreak(int n) {
        int dp[][] = new int[n][n];
        return f(n-1,n);
    }
}