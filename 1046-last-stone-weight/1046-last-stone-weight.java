class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for(int val : stones){
            pq.add(val);
        }
        
        while(pq.size() > 1){
            int val1 = pq.remove();
            int val2 = pq.remove();
            int diff = val1 - val2;
            pq.add(diff);
        }
        
        return pq.remove();
        
    }
}