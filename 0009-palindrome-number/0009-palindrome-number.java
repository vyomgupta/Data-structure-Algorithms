class Solution {
    public boolean isPalindrome(int x) {
        int no = x;
        int newno=0;
        int ld=0;
        
        while(no!=0){
            ld = no % 10;
            no = no / 10;
            int oldno = newno;
            newno = (newno * 10) + ld;
            if((newno - ld)/10  != oldno){
                return false;
            }
            
        }
        
        if(ld<0){
            return false;
        }
        
        System.out.println(newno);
        return x == newno;
    }
}