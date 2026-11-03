class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}