class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0, min = Integer.MAX_VALUE;
        
        String s = strs[0];
        
        if(strs.length == 1){
            return s;
        }
        
        for(int i = 1 ; i < strs.length ; i ++){
            String str = strs[i];
            count = 0;
            
            for(int j = 0 ; j < s.length() && j < str.length() ; j ++){
                if(str.charAt(j)!=s.charAt(j)){
                    break;
                }
                count ++;
            }
            min = Math.min(count,min);
        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        
        return s.substring(0,min);
    }
}