class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int idx = 0;
        int sidx = 0;
        int eidx = nums.length -1;
        
        while(idx <= eidx){
            if(nums[idx] == 0){
                swap(nums,sidx++,idx++);
            }
            else if(nums[idx] == 1){
                idx++;
            }
            else{
                swap(nums,eidx--,idx);
            }
        }
        
        
        
    }
}