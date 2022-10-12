class Solution {
    
    public int minF(int words[]){
        int min = Integer.MAX_VALUE;
        for(int val:words){
            if(val == 0) continue;
            min = Math.min(val,min);
        }
        return min;
    }
    
    public int maxF(int words[]){
        int max = 0;
        for(int val:words){
            if(val == 0) continue;
            max = Math.max(val,max);
        }
        return max;
    }
    public int beautySum(String s) {
        int count = 0;
        for(int i = 0 ; i<s.length() ; i++){
            int words[] = new int[26];
            for(int j = i ; j < s.length() ; j ++){
                char ch = s.charAt(j);
                words[ch-'a']++;
                
                int cal = maxF(words) - minF(words);
                count +=cal;
            }
        }
        return count;
        
    }
}