class Solution {
    
    public boolean isPossible(int nums[], int treshold, int mid){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            count+=val/mid;
            if(val%mid!=0) count++;
        }
        return count<=treshold?true:false;
    }
    
    public int smallestDivisor(int[] nums, int threshold) {
        
        int s = 1;
        int e = 1000000009;
        int ans = -1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isPossible(nums,threshold,mid)){
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