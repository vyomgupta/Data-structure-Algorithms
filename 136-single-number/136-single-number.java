class Solution {
    public int singleNumber(int[] nums) {
        int xor =0;
        
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            xor^=val;
        }
        return xor;
    }
}