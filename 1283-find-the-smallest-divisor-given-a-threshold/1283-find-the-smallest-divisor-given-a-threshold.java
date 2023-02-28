class Solution {
    
    
    public boolean isValid(int nums[], int mid, int threshold){
        int count = 0;
        for(int i = 0 ; i < nums.length ;  i ++){
            int val = nums[i];
            
            int cal = val / mid;
            count+=cal;
            int rem = val%  mid;
            if(rem!=0){
                count++;
            }
            
        }
        
        return count <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int e = Integer.MAX_VALUE - 2;
        int ans = -1;

        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(isValid(nums,  mid, threshold)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        
        return ans;
        
        
        
        
    }
}