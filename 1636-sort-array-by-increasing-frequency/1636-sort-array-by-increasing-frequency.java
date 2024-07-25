class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] numss = new Integer[nums.length];

        // Count the frequency of each element in nums and copy elements to numss
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            numss[i] = val;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // Sort numss by frequency, and by value if frequencies are the same
        Arrays.sort(numss, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a); // Sort by value in descending order if frequencies are the same
            }
        });

        // Copy the sorted elements back to nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numss[i];
        }

        return nums;
    }
}
