class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        if(sum % 2 == 0){
            int len = nums.length;
            int half = sum / 2;

            boolean[][] dp = new boolean[len + 1][half + 1];

            for(int n = 0; n <= len; n++){
                for(int bag = 0; bag <= half; bag++){
                    if(n == 0){
                        dp[n][bag] = false;
                    }
                    if(bag == 0){
                        dp[n][bag] = true;
                    }
                }
            }

            for(int n = 1; n <= len; n++){
                for(int bag = 1; bag <= half; bag++){
                    if(nums[n - 1] <= bag){
                        dp[n][bag] = 
                        dp[n - 1][bag - nums[n - 1]] || dp[n - 1][bag];
                    }
                    else{
                        dp[n][bag] = dp[n - 1][bag];
                    }
                }
            }
            return dp[len][half];
        }
        return false;
    }
}