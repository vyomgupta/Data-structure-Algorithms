class Solution {
    
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int nums[], int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++; e--;
        }
    }
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int maxSorted = -1;
        for(int i = n - 1 ; i>0 ; i--){
            if(nums[i-1] < nums[i]){
                maxSorted = i-1;
                break;
            }
        }
        
        if(maxSorted == -1){
           reverse(nums, 0, n-1);
        }
        else{
            int gMaxSorted = -1;
            for(int i = n - 1 ; i>=0 ; i--){
                if(nums[maxSorted] < nums[i]){
                    gMaxSorted = i;
                    break;
                }
            }
        
            swap(nums,maxSorted,gMaxSorted);
            reverse(nums,maxSorted+1,n-1);
        }
        
        
        
    }
}