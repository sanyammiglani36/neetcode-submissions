class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int maxSum = sum;
        for(int i = 1;i<n;i++){
            if(nums[i] > nums[i-1]){
                sum = sum + nums[i];
            }
            else{
                sum = nums[i];
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}