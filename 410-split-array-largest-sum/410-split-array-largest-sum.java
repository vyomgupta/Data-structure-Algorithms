class Solution {
    
    public boolean isPossible(int nums[], int m, long mid){
        long sum = 0, count =1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>mid){
                return false;
            }
            if(sum>mid){
                sum=0;
                sum+=nums[i];
                count++;
            }
        }
        return count<=m?true:false;
    }
    public int splitArray(int[] nums, int m) {
        int max = 0; long sum = 0;
        for (int num : nums) {
            max = Math.max(num, max);
            sum += num;
        }
        
        long ans = -1;
        long s = max;
        long e = sum;
        
        while(s<=e){
            long mid = s+(e-s)/2;
            if(isPossible(nums,m,mid)){
                e = mid-1;
                ans =(mid);
            }
            else{
                s = mid+1;
            }
        }
        return (int)(ans);
        
    }
}