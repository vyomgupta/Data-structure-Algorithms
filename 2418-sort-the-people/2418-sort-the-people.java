class Solution {
    
    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer,String> map = new HashMap<>();
        
        for(int i=0;i<heights.length;i++){
            int val = heights[i];
            String name = names[i];
            map.put(val,name);
        }
        
        Arrays.sort(heights);
        
        String ans[] = new String [names.length];
        
        int idx=0;
        
        for(int i=heights.length-1;i>=0;i--){
            ans[idx++] = map.get(heights[i]);
        }
        return ans;
    }
}