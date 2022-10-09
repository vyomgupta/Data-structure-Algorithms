class Solution {
    public int findMin(int[] nums) {
        
        
        int s = 0;
        int e = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        
        while(s <= e){
            int mid = s +(e - s) / 2;
            ans = Math.min(ans,nums[mid]);
            if(nums[mid] >=  nums[e]){
                s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
        
        return ans;
        
    }
}