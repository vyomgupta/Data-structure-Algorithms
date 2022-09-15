class Solution {
    public int reverse(int x) {
        boolean flag = false;
        int ans=0;
        int oldans=0;
        
        while(x!=0){
            int val = x%10;
            ans = (ans*10)+ val;
            if((ans-val)/10 != oldans){
                return 0;
            }
            oldans=ans;
            flag=true;
            x=x/10;
        }
        return ans;
        
        
    }
    public boolean isPalindrome(int x) {
        int ovalue=x;
        int ans=0;
        int oldans=0;
        
        while(x!=0){
            int val = x%10;
            if(val<0){
                return false;
            }
            ans = (ans*10)+ val;
            if((ans-val)/10 != oldans){
                return false;
            }
            oldans=ans;
            x=x/10;
        }
        return ans==ovalue?true:false;
    }
}