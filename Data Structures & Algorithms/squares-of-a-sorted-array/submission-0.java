class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);

        for(int i=0;i<ans.length;i++){
            nums[i] = ans[i];
        }
        return ans;
    }
}