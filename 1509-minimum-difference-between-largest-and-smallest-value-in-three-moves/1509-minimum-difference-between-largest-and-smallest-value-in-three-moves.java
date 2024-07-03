class Solution {
    public int minDifference(int[] nums) {
        
        if(nums.length <= 4) return 0;
        
//         PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        
//         for(int i = 0 ; i < nums.length ; i ++){
//             pq.add(nums[i]);
//             pq2.add(nums[i]);
//         }
        
//         int max = pq1.remove();
//         int smax = pq1.remove();
//         int tmax = pq1.remove();
        
//         int min = pq2.remove();
//         int smin = pq2.remove();
//         int tmin = pq2.remove();
        
        //0 1 5 10 14
         Arrays.sort(nums);
        int maxarr[] = new int[4];
        int minarr[] = new int[4];
         
        maxarr[0] = nums[3];
        maxarr[1] = nums[nums.length - 4];
        maxarr[2] = nums[1];
        maxarr[3] = nums[2];
        
        minarr[0] = nums[3];
        minarr[1] = nums[nums.length - 4];
        minarr[2] = nums[1];
        minarr[3] = nums[2];
        
       
        System.out.println(maxarr[1] + " "+minarr[1]);
        for(int i = 0 ; i < nums.length ; i++){
            int val = nums[i];
            if(i>2){
                maxarr[0] = Math.max(maxarr[0],val);
                minarr[0] = Math.min(minarr[0],val);
            }
            if(i < nums.length - 3){
                System.out.println(val);
                maxarr[1] = Math.max(maxarr[1],val);
                minarr[1] = Math.min(minarr[1],val);
            }
            if(i > 0 && i < nums.length - 2){
                maxarr[2] = Math.max(maxarr[2],val);
                minarr[2] = Math.min(minarr[2],val);
            }
            if(i > 1 && i < nums.length - 1){
                maxarr[3] = Math.max(maxarr[3],val);
                minarr[3] = Math.min(minarr[3],val);
            }
            
        }
        System.out.println(maxarr[1] + " "+minarr[1]);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < 4 ; i ++){
            
            int diff = maxarr[i] - minarr[i];
            ans = Math.min(ans,diff);
        }
        
        return ans;
        
        
        
        
        
    }
}