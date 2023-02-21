class Solution {
    public int mySqrt(int x) {
        
        int s = 1;
        int e = x;
        int ans = 0;
        
        while(s <= e){
            int mid = s +(e - s)/2;
            long square = (long)mid * mid;
            long diff =(long) x - square;
            if(diff < 0){
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid +1;
            }
        }
        return ans;
        
    }
}