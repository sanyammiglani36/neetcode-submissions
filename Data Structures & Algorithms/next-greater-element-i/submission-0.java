class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] ans = new int[n];

        for(int i=0;i<n;i++){
            int j = 0;
            while(j<m && nums2[j] != nums1[i]){
                j++;
            }
            int greater = -1;

            for(int k = j+1;k<m;k++){
                if(nums2[k] > nums1[i]){
                    greater = nums2[k];
                    break;
                }
            }
            ans[i] = greater;
        }
        return ans;
    }
}