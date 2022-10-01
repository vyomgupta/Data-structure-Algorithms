class Solution {
    
    
    public int merge(int nums[], int s, int e){
        
        int ans[] = new int[e-s+1];
        int i=s;
        int mid = (s+e)/2;
        int j = mid+1;
        int count=0;
        int idx = 0;
        int l=mid+1;
        
        for(int k=s;k<=mid;k++){
            while(l<=e && nums[k] > (2*(long)nums[l])){
                l++;
            }
            count+=(l-(mid+1));
        }
        
        while(i<=mid && j<=e){
            if(nums[i]<=nums[j]){
                ans[idx++] = nums[i++];
            }
            else{
                ans[idx++] = nums[j++];
            }
        }
        
        while(i<=mid){
            ans[idx++] = nums[i++];
        }
        
        while(j<=e){
            ans[idx++] = nums[j++];
        }
        
        idx=0;
        
        for(i=s; i<=e ; i++){
            nums[i] = ans[i-s];
        }
        
        return count;
        
    }
    public int mergeSort(int s, int e, int nums[]){
        if(s>=e){
            return 0;
        }
        int mid = (s + e) / 2;
        int count=0;
        
        count+=mergeSort(s, mid, nums);
        count+=mergeSort(mid+1,e,nums);
        count+=merge(nums,s,e);
        return count;
    }
    
    public int reversePairs(int[] nums) {
          return mergeSort(0,nums.length-1,nums);
    }
}
