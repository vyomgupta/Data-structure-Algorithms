class Solution {
    public int subarraySum(int[] nums, int k){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            sum += val;
            int dif = sum - k;
            // if(dif==0){
            //     count++;
            // }
            if(map.containsKey(dif)){
                count+=map.get(dif);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
}