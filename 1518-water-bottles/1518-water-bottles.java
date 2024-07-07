class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int count = 0;
        int empty = 0;
        
        while(numBottles!=0){
            count++;
            empty++;
            numBottles--;
            if(empty == numExchange){
                numBottles++;
                empty = 0;
            }
            
        }
        return count;
        
    }
}