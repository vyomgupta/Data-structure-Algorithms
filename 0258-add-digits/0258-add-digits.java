class Solution {
    
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    
    public int solve(int num){
        if(num/ 10 == 0) return num;
        int sum = sum(num);
        int small = solve(sum);
        return small;
        
    }
    public int addDigits(int num) {
        return solve(num);
    }
}