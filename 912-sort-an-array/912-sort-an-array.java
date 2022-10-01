class Solution {
    public int[] merge(int arr[], int arr2[]){
        int ans[] = new int[arr.length+arr2.length];
        int i = 0;
        int j = 0;
        int idx = 0;
        
        while(i<arr.length && j<arr2.length){
            if(arr[i]>=arr2[j]){
                ans[idx++] = arr2[j++];
            }
            else{
                ans[idx++] = arr[i++];
            }
        }
        
        while(i<arr.length){
            ans[idx++] = arr[i++];
        }
        
        while(j<arr2.length){
            ans[idx++] = arr2[j++];
        }
        return ans;
    }
    
    public int[] mergeSort(int s, int e, int nums[]){
        if(s>=e){
            return new int[]{nums[s]};
        }
        
        int mid = (s + e) / 2;
        int left[] = mergeSort(s,mid,nums);
        int right[] = mergeSort(mid+1,e,nums);
        return merge(left,right);
        

    }
    public int[] sortArray(int[] nums) {
       return mergeSort(0, nums.length-1, nums);
        
    }
}