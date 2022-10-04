class Solution {
    
    public boolean check(int piles[], long k, int h){
        
        long count = 0;
        
        for(int i = 0 ; i<piles.length ; i++){
            int val = piles[i];
            count+=val/k;
            if(val%k!=0){
                count++;
            }
        }
        return count<=h?true:false;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        
        long s = 1;
        long e = 1000000000;
        int ans = -1;
        
        while(s<=e){
            long mid = s +(e-s)/2;
            if(check(piles,mid,h) == true){
                e = mid - 1;
                ans = (int)(mid);
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
        
    }
}