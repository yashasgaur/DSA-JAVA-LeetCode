class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;

        for(int row = 0; row < accounts.length; row++){
            int curr_wealth = 0;
            for(int col = 0; col < accounts[row].length; col++){
                curr_wealth += accounts[row][col];
            }
            max_wealth = Math.max(max_wealth, curr_wealth);
        }

        return max_wealth;
    }
}