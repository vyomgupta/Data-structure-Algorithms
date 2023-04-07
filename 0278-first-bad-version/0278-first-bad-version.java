/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int s = 0;
        int e = n;
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s )/2;
            
            if(isBadVersion(mid)){
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