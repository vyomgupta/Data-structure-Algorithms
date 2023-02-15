class Solution {
    
    
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0])); 
        int n = intervals.length;
        int count = 0;
        for(int i = 1 ; i < n ; i ++){
            int prevs = intervals[i-1][0]; 
            int preve = intervals[i-1][1];
            int s = intervals[i][0]; 
            int e = intervals[i][1];
            if(s <= preve){
                intervals[i][0] = prevs;
                intervals[i][1] = Math.max(e,preve);
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
                count++;
            }
        }
        
        int ans[][] = new int[n - count][2];
        int idx = 0;
        
        for(int i = 0 ; i < n ; i ++){
            if(intervals[i][0] != -1){
                ans[idx][0] = intervals[i][0];
                ans[idx][1] = intervals[i][1];
                idx++;
            }
            
        }
        
        return ans;
        
    }
}