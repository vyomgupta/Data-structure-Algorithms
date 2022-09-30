class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        m--;
        n--;
        int i = nums1.length-1;
        for(i =nums1.length-1; i>=0 && m>=0 && n>=0 ; i--){
            if( nums1[m] >= nums2[n]){
                nums1[i] = nums1[m--];
            }
            else if( nums1[m] < nums2[n]){
                nums1[i] = nums2[n--];
            }
        }
        
        if(m>=0){
            while(i>=0 && m>=0){
                nums1[i--] = nums1[m--];
            }
        }
        
        if(n>=0){
            while(i>=0 && n>=0){
                nums1[i--] = nums2[n--];
            }
        }
    
    }
}