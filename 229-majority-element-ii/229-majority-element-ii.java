class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        
        int fcandidate=Integer.MIN_VALUE;
        int scandidate=Integer.MAX_VALUE;
        int fcsum=0;
        int scsum=0;
        
        
        for(int i=0 ; i<nums.length ; i++){
            int val = nums[i];
            if(val == fcandidate){
                fcsum++;
            }
            else if(val == scandidate){
                scsum++;
            }
            else if(fcsum == 0){
                fcandidate = val;
                fcsum = 1;
            }
            else if(scsum == 0){
                scandidate = val;
                scsum = 1;
            }
            else{
                fcsum--;
                scsum--;
            }
        }
        
        int count1=0; int count2=0;
        
        for(int i=0 ; i<nums.length ; i++){
            int val = nums[i];
            if(val==fcandidate) count1++;
            if(val==scandidate) count2++;
        }
        
        if(count1> nums.length/3){
            ans.add(fcandidate);
        }
        if(count2> nums.length/3){
            ans.add(scandidate);
        }
        
        return ans;
    }
}