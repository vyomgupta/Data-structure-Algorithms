class Solution {
    
    public void swap(int nums[], int s, int f){
        int temp = s;
        s = f;
        f = temp;
    }
    
    public void sortColors(int[] nums) {
        int zero = 0;
        int one  = 0;
        int two  = 0;
        
        for(int i=0 ; i < nums.length ; i++){
            int val = nums[i];
            if(val==0) zero++;
            if(val==1) one++;
            if(val==2) two++;
        }
        
        int idx=0;
        
        while(idx < nums.length){
            if(zero!=0){
                nums[idx]=0;
                zero--;
            }
            else if(one!=0){
                nums[idx]=1;
                one--;
            }
            else{
                nums[idx]=2;
                two--;
            }
            idx++;
        }
        
    }
}