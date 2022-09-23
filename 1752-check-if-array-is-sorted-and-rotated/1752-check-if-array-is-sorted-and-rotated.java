class Solution {
    public boolean check(int[] nums) {
        
        int incorrect = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                incorrect++;
            }
        }
        return incorrect<=1?true:false;
    }
}