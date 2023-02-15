class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        result.add(a);
        
        for(int i = 1 ; i < numRows ; i ++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0 ; j <= i ; j ++){
                if(j == 0 || j == i){
                    ans.add(1);
                }
                else{
                    ans.add(result.get(i-1).get(j) + result.get(i-1).get(j - 1));
                }
            }
            result.add(ans);
        }
        
        return result;
        
        
        
    }
}