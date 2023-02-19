class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        int leader = Integer.MIN_VALUE;
        int count1  = 0;
        
        int leader2 = Integer.MAX_VALUE;
        int count2  = 0;
        
        
        
        for(int i = 0 ; i < nums.length ; i ++){
            
            if(leader == nums[i]){
                count1++;
            }
            else if(leader2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                leader = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                leader2 = nums[i];
                count2 = 1;
            }
            
            else{
                count2--;
                count1--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == leader){
                c1++;
            }
            if(nums[i] == leader2){
                c2++;
            }
        }
       
      int n = nums.length;
        if(c1>n/3){
            ans.add(leader);
        }
        
        if(c2>n/3){
            ans.add(leader2);
        }
        return ans;
        
        
        
    }
}