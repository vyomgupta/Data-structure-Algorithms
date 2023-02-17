class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int s = 0;
        int e= 0;
        boolean first = false;
        for(int i = 0 ; i < nums.length ; i ++){
            int val = nums[i];
            sum += val;
            if(sum > max){
                if(first == true){
                    e = i;
                }
                else{
                    first = true;
                    s = i;
                    e = i;
                }
                max = sum;
                
            }
            
            if(sum < 0){
                sum = 0;
                first = false;
            }
        }
        System.out.println(s+" "+e);
        return max;
        
    }
}