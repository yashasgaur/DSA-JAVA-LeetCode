class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int curr_profit = 0;
        int max_profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }
            else{
                curr_profit = prices[i] - buy_price;
                max_profit = Math.max(curr_profit, max_profit);
            }
        }
        return max_profit;
    }
}