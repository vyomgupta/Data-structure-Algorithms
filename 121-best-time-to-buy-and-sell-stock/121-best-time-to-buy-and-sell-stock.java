class Solution {
    public int maxProfit(int[] prices) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i< prices.length ; i++){
            int val = prices[i];
            min = Math.min(val,min);
            max = Math.max(val-min,max);
        }
        return max;
    }
}