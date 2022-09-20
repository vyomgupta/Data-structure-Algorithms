class Solution {
    public int countPrimes(int n) {
        
        boolean size[] = new boolean[n+1];
        
        for(int i=2;i*i<=n;i++){
            if(size[i]==false){
                for(int j=2;j*i<n;j++){
                    size[i*j]=true;
                }
            }
        }
        int count = 0;
        
        for(int i=2;i<n;i++){
            if(size[i]==false){
                count++;
            }
        }
        
        return count;
        
    }
}