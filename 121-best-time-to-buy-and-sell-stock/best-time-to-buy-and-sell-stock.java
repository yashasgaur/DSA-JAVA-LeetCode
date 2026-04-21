class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int curr_profit = 0;
        int max_profit = 0;

        for(int price : prices){
            if(price < buy_price){
                buy_price = price;
            }

            else if(price > buy_price){
                curr_profit = price - buy_price;
                max_profit = Math.max(max_profit, curr_profit);
            }
        }

        return max_profit;
    }
}