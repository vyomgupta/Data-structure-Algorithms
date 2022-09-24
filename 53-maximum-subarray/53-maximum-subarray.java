class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        boolean negative=false;
        
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            max = Math.max(max,val);
            sum+=val;
            if(val>0){
                max = Math.max(max,sum);
            }
            if(sum<0){
                sum=0;
            }
            
        }
        return max;
    
    }
}