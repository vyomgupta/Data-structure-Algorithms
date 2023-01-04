class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0;i<tasks.length;i++){
            int val = tasks[i];
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        for(int val:map.keySet()){
            if(map.get(val) == 1){
                return -1;
            }
            else if(map.get(val) % 3 == 0){
                count+= map.get(val)/3;
            }
            else{
                count+= map.get(val)/3;
                count++;
            }
        }
        return count;
        
    }
}