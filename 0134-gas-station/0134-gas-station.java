class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalDiff=0,currDiff = 0;
        int idx=0;
        for(int i=0;i<gas.length;i++){
            int val = gas[i]-cost[i];
            totalDiff+=val;
            currDiff+=val;
            if(currDiff<0){
                idx=i+1;
                currDiff=0;
            
        }
        
    }
        return (totalDiff<0)?-1:idx;
}
}