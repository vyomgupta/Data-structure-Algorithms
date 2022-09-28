class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        int i = 1;
        while(i < n){
            int mstart = intervals[i][0];
            int mend   = intervals[i][1];
            int lstart = intervals[i-1][0];
            int lend  =  intervals[i-1][1];
            if(mstart<=lend){
                intervals[i][0] =lstart;
                intervals[i][1] = Math.max(lend,mend);
                intervals[i-1][0] = -1;
                intervals[i-1][1] = -1;
            }
            i++;
        }
        
        int count = 0;
        for( i=0; i < n ; i++){
            if(intervals[i][0] !=-1){
                count++;
            }
        }
        int idx=0;
        int ans[][] = new int[count][2];
            for(i=0; i < n ; i++){
            if(intervals[i][0] !=-1){
                ans[idx][0] = intervals[i][0];
                ans[idx][1] = intervals[i][1];
                idx++;
            }
        }
        return ans;
        }
    }