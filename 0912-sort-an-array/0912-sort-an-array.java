class Solution {
    
    public void merge(int nums[], int s, int e, int mid){
        
        int arr[] = new int[e - s + 1];
        
        int idx = 0;
        int i = s;
        int j = mid + 1;
        
        while(i <= mid && j <= e){
            if(nums[i] < nums[j]){
                arr[idx++] = nums[i++];
            }
            else{
                arr[idx++] = nums[j++];
            }
        }
        while(i <=mid) arr[idx++] = nums[i++];
        while(j <=e) arr[idx++] = nums[j++];
        
        for(int l = 0 ; l < arr.length ; l ++){
            nums[l+s] = arr[l];
        }
        
        
    }
    
    public void sort(int s, int e, int nums[]){
        
        if(s >= e){
            return;
        }
        
        int mid = (s + e) / 2;
        
        sort(s, mid, nums);
        sort(mid + 1, e, nums);
        merge(nums, s, e, mid);
    }
    public int[] sortArray(int[] nums) {
        sort(0, nums.length - 1, nums);
        return nums;
        
    }
}