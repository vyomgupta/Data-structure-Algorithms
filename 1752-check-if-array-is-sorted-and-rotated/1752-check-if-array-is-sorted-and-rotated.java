class Solution {
    public boolean check(int[] nums) {
        
        int allowed=0;
        int n = nums.length;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                allowed++;
            }
        }
        if(nums[n-1]>nums[0]){
            allowed++;
        }
        
        return allowed>=2?false:true;
    }
}