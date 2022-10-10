class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=arr.length-1;i>=0;i--){
            String str = arr[i];
            if(str==""){
                continue;
            }
            else if(str!=""){
               sb.append(str+" "); 
            }
            
        }
        String ans = sb.toString();
        return ans.substring(0,ans.length()-1);
        
    }
}