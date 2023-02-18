class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0 ; i < nums.length - 3 ; i ++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            
            for(int j = i + 1 ; j < nums.length - 2 ; j++){
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                
                int s = j + 1; 
                int e = n - 1;
                
                long total = nums[i] + nums[j];
                long t = (long)(target - total);
                while(s < e){
                    
                    if(nums[s] + nums[e] < t){
                        s++;
                    }
                    else if (nums[s] + nums[e] > t){
                        e--;
                    }
                    else{
                        while(s < e && nums[s] == nums[s + 1]) s++;
                        while(s < e && nums[e] == nums[e - 1]) e--;
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]); ans.add(nums[j]); ans.add(nums[s]);
                        ans.add(nums[e]);
                        result.add(ans);
                        s++; e--;
                        
                    }
                }
            }
        }
        return result;
    }
}