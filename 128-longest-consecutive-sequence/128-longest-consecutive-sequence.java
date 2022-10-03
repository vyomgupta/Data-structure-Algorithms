class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],false);
        }
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],true);
            }
        }
        
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == false){
                int idx = 0;
                while(map.containsKey(nums[i]+idx)){
                    idx++;
                }
                max = Math.max(max, idx);
            }
        }
        return max;
        
    }
}