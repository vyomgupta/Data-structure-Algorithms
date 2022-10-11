class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int words[] = new int[26];
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch  = s.charAt(i);
            char ch2 = t.charAt(i);
            int pos  = (int)(ch - 'a');
            int pos2 = (int)(ch2 - 'a');
            words[pos]++;
            words[pos2]--;
        }
        
        for(int i=0;i<words.length;i++){
            if(words[i]!=0) return false;
        }
        return true;
        
    }
}