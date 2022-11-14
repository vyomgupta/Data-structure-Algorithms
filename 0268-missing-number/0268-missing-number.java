class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
        }
        int n = nums.length;
        
        int total_sum = n * (n+1)/2;
        System.out.println(total_sum);        
        return total_sum - sum;
        
    }
}