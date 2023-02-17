class Solution {
    public int majorityElement(int[] nums) {
        
        int leader = 0;
        int count = 0;
        
        
        for(int i = 0 ; i < nums.length ; i ++){
            int val = nums[i];
            if(count == 0 ){
                leader = val;
            }
            if(leader != val){
                count --;
            }
            else{
                count ++;
            }
        }
        
        return leader;
        
    }
}