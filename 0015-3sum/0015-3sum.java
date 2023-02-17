class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int s = i + 1;
            int e = nums.length - 1;
            while(s < e){
                int sum = nums[s] + nums[e];
                if(sum < -nums[i]){
                    s++;
                }
                else if(sum > -nums[i]){
                    e--;
                }
                else{
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]); ans.add(nums[s]); ans.add(nums[e]);
                    result.add(ans);
                  //  s++;
                    //e--;
                    while(s < e && nums[s] == nums[s+1]) s++;
                    while(s < e && nums[e] == nums[e-1]) e--;
                    s++; e--;
                    
                }
            }
            
            
            
        }
        return result;
    }
}