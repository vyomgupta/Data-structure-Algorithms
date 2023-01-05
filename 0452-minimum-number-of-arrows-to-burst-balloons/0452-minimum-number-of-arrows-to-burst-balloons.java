class Solution {
    
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        
        int arrow = points[0][1];
        int count = 1;
        for(int i = 1; i < points.length ; i++){
            int start = points[i][0];
            int end   = points[i][1];
            if(start<=arrow){
                continue;
            }
            else{
                arrow = end;
                count++;
            }
        }
        return count;
        
        
        
    }
}