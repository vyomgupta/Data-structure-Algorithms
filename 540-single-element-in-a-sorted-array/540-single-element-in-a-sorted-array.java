class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int n = nums.length/2;
    //    System.out.println(n+1);
        
        
        int s = 0; int e = nums.length - 1 ;
        
        if(nums.length ==1){
            return nums[0];
        }
        while(s <= e){
            int mid = s +(e - s) /2;
            System.out.println(mid+" " +nums[mid]);
            if(mid == 0  && nums[mid+1]!=nums[mid]){
                return nums[mid];
            }
            else if(mid == nums.length - 1 && nums[mid-1]!=nums[mid]){
                return nums[mid];
            }
            else if(mid>0 && mid < nums.length -1 && (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) ){
                
                return nums[mid];
            }
            else if(mid < nums.length -1 && nums[mid] == nums[mid+1]){
                if((mid+1)%2==0){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else if(mid>0 && nums[mid] == nums[mid-1]){
                if(mid%2==0){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else{
                s = mid + 1;
            }
            
            
        }
        
        return -1;
        
    }
}