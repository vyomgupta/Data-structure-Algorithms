class Solution {
    public String largestOddNumber(String num) {
        int idx = -1;
        for(int i=num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
            int no = ch-'0';
            if(no%2!=0){
                idx=i;
                break;
            }
        }
        return num.substring(0,idx+1);
    }
}