class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int max = 0;

        for(int i=1;i<n;i++){
            int leftZeros = 0;
            int rightOnes = 0;

            for(int j=0;j<i;j++){
                if(s.charAt(j) == '0'){
                    leftZeros++;
                }
            }
            for(int j=i;j<n;j++){
                if(s.charAt(j) == '1'){
                    rightOnes++;
                }
            }
            int score = leftZeros + rightOnes;
            max = Math.max(max,score);
        }
        return max;

    }
}