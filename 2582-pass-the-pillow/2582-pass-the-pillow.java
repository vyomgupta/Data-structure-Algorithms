class Solution {
    public int passThePillow(int n, int time) {
        int i = 1;
        boolean back = false;
        while(time > 0){
            if(i == 1){
                back = false;
            }
            if(i == n){
                back = true;
            }
            if(back == false) i++;
            if(back == true) i--;
            
            time --;
            
        }
        return i;
        
    }
}