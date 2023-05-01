class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        
        for(int val : salary){
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        
        for(int val : salary){
            if(val!=max && val!=min){
                sum += val;
            }
        }
        
        return (double)(sum/(salary.length - 2));
        
        
        
    }
}