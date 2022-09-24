class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
        
        
    }
}