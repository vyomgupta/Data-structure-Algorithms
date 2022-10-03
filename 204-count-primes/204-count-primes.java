class Solution {
    public int countPrimes(int n) {
        
        
        boolean primes[] = new boolean[n+1];
        
        
        for(int i=2;i*i<=n;i++){
            if(primes[i] == false){
                for(int j=2;i*j<n;j++){
                    primes[j*i] = true;
                }
            }
        }
        
        int count = 0;
        
        for(int i=2;i<n;i++){
            if(primes[i] == false){
               // System.out.print(i+" ")
                count++;
            }
        }
        
        return count;
        
    }
}