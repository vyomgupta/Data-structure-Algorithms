class Solution {
    public int maxProduct(int[] nums) {
        
        int sum = 1;
        int max = Integer.MIN_VALUE;
        
        
        for(int i = 0 ; i < nums.length ; i ++){
            int val = nums[i];
            sum= sum * val;
            max = Math.max(sum,max);
            if(val == 0) sum = 1;
        }
        System.out.println(sum);
        
        sum = 1;
        for(int i = nums.length -1 ; i >= 0 ; i --){
            int val = nums[i];
            sum*=val;
            max = Math.max(sum,max);
            if(val == 0) sum = 1;
        }
        
        return max;
        
    }
}