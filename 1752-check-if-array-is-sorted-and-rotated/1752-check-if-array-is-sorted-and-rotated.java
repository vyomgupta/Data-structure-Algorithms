class Solution {
    public boolean check(int[] nums) {
        
        int incorrect = 0;
        if(nums[nums.length-1]>nums[0]){
            incorrect++;
        }
        
        for(int i=0 ; i<nums.length - 1 ; i++){
            if(nums[i] > nums[i+1]){
                incorrect++;
            }
        }
        return incorrect<=1?true:false;
    }
}