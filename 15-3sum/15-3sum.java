class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0 ;i<nums.length;i++){
            int val = nums[i];
            if(i>0 && nums[i] == nums[i-1]) continue;
            int s = i+1;
            int e = nums.length - 1;
            int req = -nums[i];
            while(s < e){
                int msum = nums[s] + nums[e];
                if(msum < req){
                    s++;
                }
                else if(msum > req){
                    e--;
                }
                else{
                    while(s< nums.length-1 && e>0 && nums[s] == nums[s+1] && nums[e] == nums[e-1]){
                        s++; e--;
                    }
                    List<Integer> ans = new ArrayList<>();
                    ans.add(val); ans.add(nums[s]); ans.add(nums[e]);
                    result.add(ans);
                    s++;
                    e--;
                }
            }
            
        }
        return result;
        
    }
}