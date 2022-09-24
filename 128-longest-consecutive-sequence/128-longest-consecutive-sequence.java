class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for(int i=0; i<nums.length-1 ; i++){
            System.out.print(nums[i]+" ");
            if(nums[i+1] == nums[i] ){
                continue;
            }
            if(nums[i+1] - nums[i] == 1){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
//         HashMap<Integer,Boolean> map = new HashMap<>();
        
//         for(int val : nums){
//             map.put(val , true);
//         }
        
//         for(int val: map.keySet()){
//             int count = 0;
//             while(map.containsKey(val)){
//                 count++;
//                 val++;
//             }
//              max = Math.max(count,max);
//         }
        
        return max;
        
    }
}