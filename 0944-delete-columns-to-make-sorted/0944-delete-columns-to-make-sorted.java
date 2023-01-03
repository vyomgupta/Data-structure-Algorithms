class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        char arr[][] = new char[n][m];
        
        for(int i = 0 ; i < strs.length ; i++){
            for(int j = 0 ; j < strs[i].length() ; j ++){
                arr[i][j] = strs[i].charAt(j);
            }
        }
        
        int count = 0;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 1 ; j < n ; j ++){
                if(arr[j][i] < arr[j-1][i]){
                    count++;
                    break;
                }    
            }
        }
        
        
        
        
        return count;
        
        
        
    }
}