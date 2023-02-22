class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        
        int idx = 1;
        int i = 0;
        nums[0] = nums[0];
        for( i = 1 ; i < nums.length ; ){
            int val = nums[i];
            if(nums[i] != nums[i-1]){
                nums[idx++] = nums[i++];
            }
            else{
                i++;
            }
        }
        
        return idx;
        
    }
}