class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;

        for(int i=0;i<n;i++){
            for(int j =  i+1;j<n;j++){
                if(prices[j] > prices[i]){
                    int profit = prices[j] - prices[i];
                    max = Math.max(max,profit);
                }
            }
        }
        return max;
    }
}
