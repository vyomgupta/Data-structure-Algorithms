class Solution {
    
    public void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    public void moveZeroes(int[] nums) {
        
        int s  = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[s++] = nums[i];
            }
        }
        
        for(int i=s;i<nums.length;i++){
            nums[i]=0;
        }
    }
}