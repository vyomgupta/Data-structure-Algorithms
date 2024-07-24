class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer numss[] = new Integer[nums.length];

        for(int i = 0 ; i < nums.length ; i ++){
            int val = nums[i];
            numss[i] = val;
            String v = ""+val;
            int ans = 0;
            for(int j = 0  ; j < v.length() ; j ++){
                char d = v.charAt(j);
                int md = mapping[d -'0'];
                ans = (ans*10)+md;
            }
            map.put(val,ans);

        }

        
        Arrays.sort(numss,(a,b) -> Integer.compare(map.get(a), map.get(b)));

        for(int i = 0 ; i < numss.length ; i ++){
            nums[i] = numss[i];
        }

        return nums;

        
    }
}