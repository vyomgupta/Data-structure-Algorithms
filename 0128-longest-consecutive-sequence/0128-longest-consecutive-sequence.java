class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        int max = 0;
        
        for(int val : nums){
            map.put(val,true);
        }
        
        for(int val : nums){
            if(map.containsKey(val - 1)){
                map.put(val,false);
            }
        }
        
        for(int i = 0 ; i < nums.length ; i ++){
            int val = nums[i];
            int count = 1;
            
            if(map.get(val) == true){
                int nval = val+1;
                while(map.containsKey(nval)){
                    count++;
                    nval++;
                }
                max = Math.max(count,max);
            }
        }
        
        return max;
        
    }
}