class Solution {
    private boolean isPossible(int[] bloomDay, int mid, int k,int booket) {
        int bouquets = 0, flowersCollected = 0;
        for (int value : bloomDay) {
            if (value <= mid) {
//                If the current flower can be taken with in days then increase the flower flowersCollected.
                flowersCollected++;
            } else {
//                If there is a flower in between that takes more number of days then the given day, then resent the counter.
                flowersCollected = 0;
            }
//            If the flowersCollected is same as the required flower per bookie, then increase the bouquets count;
            if (flowersCollected == k) {
                bouquets++;
                flowersCollected = 0;
            }
        }

        return bouquets>=booket;

    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        
        if(m*k>bloomDay.length) return -1;
         int s = 1;
        int e = 1000000009;
        int ans = -1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(isPossible(bloomDay,mid,k,m)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
        
    }
}