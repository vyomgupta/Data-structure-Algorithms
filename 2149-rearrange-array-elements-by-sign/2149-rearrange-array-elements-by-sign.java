class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int positive[] = new int[nums.length/2];
        int negative[] = new int[nums.length/2];
        
        int pidx = 0; int nidx = 0;
        
        for(int val:nums){
            if(val>=0) positive[pidx++]=val;
            if(val<0) negative[nidx++]=val;
        }
        pidx = 0; nidx = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) nums[i] = positive[pidx++];
            if(i%2==1) nums[i] = negative[nidx++];
        }
        
        return nums;

        
    }
}