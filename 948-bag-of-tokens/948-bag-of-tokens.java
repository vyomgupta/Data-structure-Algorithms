class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int s = 0;
        int e = tokens.length-1;
        int max=0;
        int score=0;
        if(tokens.length==1 && tokens[0]<=power){
            return 1;
        }
        while(s<=e){
            if(power>=tokens[s]){
                score++;
                power-=tokens[s];
                s++;
            }
            else{
                if(score>=1 && power+tokens[e]>=tokens[s]){
                    score--;
                    power+=tokens[e];
                    e--;
                }
                else{
                    break;
                }
            }
            max = Math.max(max,score);
            
        }
        return max;
        
        
    }
}