class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i ++){
            int val = nums2[i];
            map.put(val,i);
        }

        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        int ngr[] = new int[n];
        
        for(int i = n - 1 ; i >= 0 ; i --){
            int val = nums2[i];
            while(st.size() > 0 && st.peek() <= val){
                st.pop();
            }
            
            if(st.size() > 0){
                ngr[i] = st.peek();
            }
            else{
                ngr[i] = -1;
            }
            st.push(val);
        }
        
 
        int ans[] = new int[nums1.length];
        int idx = 0;
        
        for(int i = 0 ; i < nums1.length ; i ++){
            int val = nums1[i];
            ans[idx++] = ngr[map.get(val)];
        }
     
        return ans;
        
    }
}