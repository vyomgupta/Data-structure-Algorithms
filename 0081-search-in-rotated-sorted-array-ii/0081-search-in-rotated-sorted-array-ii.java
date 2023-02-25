class Solution {
    public boolean search(int[] nums, int target) {
        
        int s = 0;
        int e = nums.length - 1;
        
        
        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(nums[mid] == target){
                return true;
            }
            if((nums[s] == nums[mid]) && (nums[e] == nums[mid]))
            {
                s++;
                e--;
            }
             else if(nums[mid] >= nums[s]){
                if(target >= nums[s] && nums[mid] > target){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else if(nums[mid] <= nums[e]){
                if(target <= nums[e] && nums[mid] < target){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
          
        }
        return false;
        
    }
}