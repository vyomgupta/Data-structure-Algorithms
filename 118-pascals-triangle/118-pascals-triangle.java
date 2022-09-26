class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);;
        result.add(one); 
        
        for(int i = 1 ; i < numRows ; i++){
            List<Integer> ans = new ArrayList<>();
            List<Integer> prev = result.get(i-1);
            for(int j = 0 ; j <= i ; j ++){
                if(j==0) ans.add(1);
                else if(j==i) ans.add(1);
                else{
                    ans.add(prev.get(j-1)+prev.get(j));
                }
            }
            result.add(ans);
        }
        
        return result;
        
    }
}