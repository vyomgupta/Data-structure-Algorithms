class Solution {
    public int longestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
      for (int val : arr) {
         map.put(val, true);
      }

      for (int val : arr) {
         if (map.containsKey(val - 1)) {
            map.put(val, false);
         }
      }

      int ml = 0;
      for (int val : arr) {
         if(map.get(val) == true){
            int tl = 0;
            while(map.containsKey(val)){
                tl++;
                val++;
            }
             ml = Math.max(ml,tl);
         }
      }
        return ml;
    }
}