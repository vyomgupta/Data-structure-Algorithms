class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int sum = 1;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            int val = nums[i];
            sum*=val;
            max = Math.max(sum,max);  
            if(val==0){
               sum=1;
            }
                      
        }
        
        sum = 1;
        
        for(int i = n-1 ; i >= 0 ; i--){
           int val = nums[i];
            sum*=val;
            max = Math.max(sum,max);  
            if(val==0){
               sum=1;
            }
        }
        return max;
        
    }
}