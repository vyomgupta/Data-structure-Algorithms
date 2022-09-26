class Solution {
    
    public void swap(int nums[], int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
    
    public void reverse(int nums[], int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s]  = nums[e];
            nums[e] = temp;
            s++; e--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int sidx = -1;
        int gidx = -1;
        
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                sidx = i;
                break;
            }
        }
        
        if(sidx == -1){
            reverse(nums,0,n-1);
        }
        else{
            for(int j = n-1 ; j > sidx ; j--){
                int diff = nums[j] - nums[sidx];
                if(nums[sidx] < nums[j]){
                    gidx = j;
                    break;
                }
            }
            swap(nums,sidx,gidx);
            
            reverse(nums,sidx+1,n-1);
        }
        
        
        
        
    }
}