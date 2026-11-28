class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=n;i++){
            int freq = map.getOrDefault(i,0);

            if(freq == 2){
                duplicate = i;
            }
            if(freq == 0){
                missing = i;
            }
        }
        return new int[]{duplicate,missing};
    }
}