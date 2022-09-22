class Solution {
     public boolean check_sorted(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public boolean rotate(int nums[]){
        
        int x = nums.length;
        
    for(int j=0;j<nums.length;j++){
        int last = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0] = last;
        if(check_sorted(nums)==true){
            return true;
        }
    }
        return false;
    }
    public boolean check(int[] nums) {
        return rotate(nums);
    }
}