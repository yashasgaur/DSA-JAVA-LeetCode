class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;

        for(int person = 0; person < accounts.length; person++){
            int curr_wealth = 0;
            for(int account = 0; account < accounts[person].length; account++){
                curr_wealth += accounts[person][account];
            }

            //max_wealth = Math.max(max_wealth, curr_wealth); //increases tc

            if(max_wealth < curr_wealth)
                max_wealth = curr_wealth;
        }

        return max_wealth;
    }
}