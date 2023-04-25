class SmallestInfiniteSet {
    ArrayList<Integer> arr;
    public SmallestInfiniteSet() {
        arr = new ArrayList<>();
        for(int i = 1;i<=1000;i++){
            arr.add(i);
        }
    }
    
    public int popSmallest() {
        int min = Integer.MAX_VALUE;
        int midx = -1;
        
        for(int i = 0 ; i < arr.size() ; i ++){
            int val = arr.get(i);
            if(val <=  min){
                min = val;
                midx = i;
            }
        }
        arr.remove(midx);
        return min;
    }
    
    public void addBack(int num) {
        boolean flag = false;
        for(int val : arr){
            if(val == num){
                flag = true;
            }
        }
        if(!flag) arr.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */