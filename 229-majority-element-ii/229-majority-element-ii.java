class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        List<Integer> ans = new ArrayList<>();
        
        int poss1=Integer.MIN_VALUE;;
        int poss2=Integer.MAX_VALUE;;
        int count1=0;
        int count2=0;
        
        
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
             if(poss1 == val){
                count1++;
            }
            else if(poss2 == val){
                count2++;
            }
            else if(count1 ==0){
                poss1= val;
                count1=1;
            }
            
            else if(count2 == 0){
                poss2 = val;
                count2 = 1;
            }
            else{
                count1--; count2--;
            }
        }
        int c1 = 0; int c2 = 0;
        for(int i=0;i<nums.length;i++) if(nums[i]== poss1) c1++;
        for(int i=0;i<nums.length;i++) if(nums[i]== poss2) c2++;
        
        if(c1>nums.length/3) ans.add(poss1);
        if(c2>nums.length/3) ans.add(poss2);

        return ans;
    }
}