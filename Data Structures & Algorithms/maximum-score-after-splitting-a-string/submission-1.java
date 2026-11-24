class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int leftZeros = 0;
        int rightOnes = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == '1'){
                rightOnes++;
            }
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == '0'){
                leftZeros++;
            }
            else{
                rightOnes--;
            }
            int score = leftZeros + rightOnes;
            max = Math.max(score,max);
        }
        return max;
    }
}