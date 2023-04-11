class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int n = s.length();
        int count = 0;
        
        for(int i = n - 1 ; i >= 0 ; i --){
            char ch = s.charAt(i);
            if(count > 0 && ch != '*'){
                count--;

            }
            else if(ch == '*'){
                count ++;

            }
            else{
                sb.append(ch);;
            }
        }
        sb.reverse();
        return sb.toString();
        
    }
}