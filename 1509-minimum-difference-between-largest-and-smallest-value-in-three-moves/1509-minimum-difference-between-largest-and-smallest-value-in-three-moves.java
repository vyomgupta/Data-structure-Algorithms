class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;
        
        Arrays.sort(nums);
        
        // We only need to check the smallest difference between the highest and lowest
        // after removing up to three elements from either end.
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        
        // We consider four cases:
        // 1. Remove 3 largest elements
        // 2. Remove 2 largest and 1 smallest
        // 3. Remove 1 largest and 2 smallest
        // 4. Remove 3 smallest elements
        minDiff = Math.min(minDiff, nums[n-1] - nums[3]);  // Case 1
        minDiff = Math.min(minDiff, nums[n-2] - nums[2]);  // Case 2
        minDiff = Math.min(minDiff, nums[n-3] - nums[1]);  // Case 3
        minDiff = Math.min(minDiff, nums[n-4] - nums[0]);  // Case 4
        
        return minDiff;
    }
}
