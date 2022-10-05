class Solution {
    
    public boolean isPossible(int weight[], int days, int mid){
        int omid=mid;
        int count =1;
        for(int i=0;i<weight.length;i++){
            int val = weight[i];
            if(mid-val>=0){
                mid-=val;
            }
            else{
                count++;
                mid = omid;
                if(mid<val){
                    return false;
                }
                mid-=val;
                
            }
        }
        return count<=days?true:false;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        
        int s = 1;
        int e = 1000000009;
        int ans = -1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(weights,days,mid)){
                e = mid - 1;
                ans = mid;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
    }
}