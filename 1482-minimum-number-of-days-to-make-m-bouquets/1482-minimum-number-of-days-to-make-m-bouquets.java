class Solution {
    
    public boolean isValid(int[] bloomDay, int m, int k, int mid){
        int c = 0;
        int count = 0;
        
        
        for(int i = 0 ; i < bloomDay.length ; i ++){
            int val = bloomDay[i];
            
            if(val <= mid){
                c++;
            }
            else{
                c = 0;
            }
            
            if(c == k){
                count++;
                c=0;
            }
            
        }
        //System.out.println(count);
        return count>=m?true:false;
        //return true;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        
        int s = 1;
        int e = Integer.MAX_VALUE - 2;
        int ans = -1;
    
        
        System.out.println(isValid(bloomDay, m, k, 12));
        
        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(isValid(bloomDay, m, k, mid)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
        
    }
}