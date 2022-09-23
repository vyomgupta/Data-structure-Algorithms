class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[ans++] = nums[i];
            }
        }
        nums[ans] = nums[n-1];
        
        return ans+1;
        
    }
}