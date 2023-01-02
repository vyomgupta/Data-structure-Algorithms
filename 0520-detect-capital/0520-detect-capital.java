class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        boolean first = false;
        
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
                    first = true;
        }
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                cap++;
            }
        
        }
        if(first && (cap == word.length() || cap == 1) || (first == false && cap == 0)){
            return true;
        } 
        else{
            return false;
        }
}
}