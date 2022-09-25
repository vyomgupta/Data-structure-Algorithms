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

      int msp = 0;
      int ml = 0;
      for (int val : arr) {
         if(map.get(val) == true){
            int tsp = val;
            int tl = 1;

            while(map.containsKey(tsp + tl)){
               tl++;
            }

            if(tl > ml){
               ml = tl;
               msp = tsp;
            }
         }
      }
        return ml;
    }
}