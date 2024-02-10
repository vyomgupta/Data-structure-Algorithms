class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length ; i ++){
            int val = nums[i];
            if(map.containsKey(target - val)){
                ans[0] = i;
                ans[1] = map.get(target - val);
            }
            map.put(val,i);
        }
        
        return ans;
                
    }
}