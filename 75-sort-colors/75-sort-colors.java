class Solution {
    
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
    
    public void sortColors(int[] nums) {
        int idx = 0;
        int zero = 0;
        int two = nums.length -1;
        
        while(idx <= two){
            int val = nums[idx];
            if(val == 0 ){
                swap(nums, idx, zero);
                zero++;
                idx++;
            }
            else if(val == 1){
                idx++;
            }
            else{
                swap(nums,idx,two);
                two--;
            }
        }
        
    }
}