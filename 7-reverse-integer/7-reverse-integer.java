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
}