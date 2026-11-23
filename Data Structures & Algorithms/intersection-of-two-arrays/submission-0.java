class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;

        HashSet<Integer> set = new HashSet<>();
        for(int nums : nums1){
            set.add(nums);
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int nums : nums2){
            if(set.contains(nums)){
                ans.add(nums);
            }
        }
        int [] result = new int[ans.size()];
        int i = 0;

        for(int nums : ans){
            result[i++] = nums;
        }
        return result;
    }
}