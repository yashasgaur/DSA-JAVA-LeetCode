class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int curr_sum = 0;
        int length = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            curr_sum += nums[j];

            while (curr_sum >= target) {
                length = Math.min(length, j - i + 1);
                curr_sum -= nums[i];
                i++;
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }
}