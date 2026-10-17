class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0;i<n;i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            }
            else{
                int profit = prices[i] - min_value;
                max_profit = Math.max(profit,max_profit);
            }
        }
        return max_profit;
    }
}
