class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int sum = 1;
        int sum2 = 1;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            int val = nums[i];
            if(val==0){
                max = Math.max(max,0);
                sum=1;
                sum2=1;
            }
            else if(val<0){
                sum2*=val;
                sum=1;
                max =Math.max(sum2,max);
            }
            else{
                System.out.println("ho");
               sum*=val; 
               sum2*=val;
                max = Math.max(sum,Math.max(sum2,max));
            }
            
        }
        sum = 1; sum2=1;
        for(int i = n-1 ; i >= 0 ; i--){
            int val = nums[i];
            if(val==0){
                max = Math.max(max,0);
                sum=1;
                sum2=1;
            }
            else if(val<0){
                sum2*=val;
                sum=1;
                max =Math.max(sum2,max);
            }
            else{
                System.out.println("ho");
               sum*=val; 
               sum2*=val;
                max = Math.max(sum,Math.max(sum2,max));
            }
            
        }
        return max;
        
    }
}