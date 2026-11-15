class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count  = count +  map.getOrDefault(num, 0);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}