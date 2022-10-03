class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
     //   map.put(k,1);
        int sum = 0;
        
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);  
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}