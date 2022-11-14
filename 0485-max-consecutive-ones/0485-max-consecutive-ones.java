class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int val= nums[i];
            if(val == 0){
                count = 0;
            }
            else{
                count++;
            }
            max = Math.max(count,max);
        }
        
        return max;
    }
}