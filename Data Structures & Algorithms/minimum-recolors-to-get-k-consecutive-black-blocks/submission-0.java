class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int white = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
            if(i>= k-1){
                min = Math.min(white,min);

                if(blocks.charAt(i-k+1) == 'W'){
                    white--;
                }
            }
        }
        return min;
    }
}