class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        
        if(nums.length == 1){
            return nums[0];
        }
        while(s <= e){
            int mid = s + (e - s)/2;
            
            if ( mid > 0 && mid < n - 1 && (nums[mid] != nums[mid - 1]) &&  (nums[mid] != nums[mid +1]) ){
                return nums[mid];
            }
            if( (mid == n - 1 && (nums[mid] != nums[mid - 1])) || (mid == 0 && (nums[mid] != nums[mid + 1]) ) ){
                return nums[mid];
            }
            if(mid < n - 1 && nums[mid] == nums[mid + 1]){
                mid = mid + 1;
            }
            
            if(mid % 2 == 0 ){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return - 1;
    }
}