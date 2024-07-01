class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean flag = false;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            int val = arr[i];
            if(val % 2 == 1){
                if(flag == true) count++;
                else count = 1;
                flag = true;
            }
            else{
                flag = false;
            }
            if(count == 3) return true;
        }
        
        return false;
        
    }
}