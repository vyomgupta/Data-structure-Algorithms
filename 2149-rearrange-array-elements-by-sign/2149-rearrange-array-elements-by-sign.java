class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int val = nums[i];
            if(val>=0){
                ans[pos] = val;
                pos+=2;
            }
            else{
                ans[neg] = val;
                neg+=2;
            }
        }
        
        return ans;
        
    }
}