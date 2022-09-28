class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < n - 3 ; i ++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i+1 ; j < n - 2 ; j ++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int s = j + 1;
                int e = n - 1;
                
                 long totalsum = nums[i]+nums[j];
                long val = ((long)target - totalsum);
                while(s<e){
                    
                    if(nums[s]+nums[e] < val){
                        s++;
                    }
                    else if(nums[s]+nums[e] > val){
                        e--;
                    }
                    else{
                        while(s<n-1 && nums[s] == nums[s+1]) s++;
                        while(e>0 && nums[e] == nums[e-1])   e--;
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]); ans.add(nums[j]); ans.add(nums[s]); ans.add(nums[e]);
                        result.add(ans);
                        s++; e--;
                        
                    }
                }
            }
        }
        
        return result;
        
    }
}