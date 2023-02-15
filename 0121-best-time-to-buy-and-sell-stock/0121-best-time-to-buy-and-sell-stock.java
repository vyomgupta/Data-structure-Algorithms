class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i = 0 ; i < prices.length ; i ++){
            int val = prices[i];
            int cal = val - min;
            max = Math.max(max,cal);
            min = Math.min(min,val);
        }
        
        return max;
        
    }
}