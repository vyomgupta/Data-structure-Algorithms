class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int ans[] = new int[1001];
  
      List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < nums1.length ; i ++){
            int val = nums1[i];
            ans[val]++;
        }
    
        for(int i = 0; i < nums2.length ; i ++){
            int val = nums2[i];
            if(ans[val] > 0){
                ans[val]--;
                result.add(val);
            }
            
        }
        System.out.println(result);
        int idx = 0;
        int result2[] = new int[result.size()];
        
        for(int val : result){
            result2[idx] = val;
            idx++;
        }
        return result2;
        
        
     
        
        
        
        
        
        
        
        
        
    }
}