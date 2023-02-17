class Solution {
    
    public void swap(int nums[], int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    public void reverse(int nums[], int idx1, int idx2){
        int s = idx1;
        int e = idx2;
        
        while(s<=e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        
        reverse(nums,0,n-k-1);
        reverse(nums,n - k, n - 1);
        reverse(nums,0,n - 1);
        
    }
}