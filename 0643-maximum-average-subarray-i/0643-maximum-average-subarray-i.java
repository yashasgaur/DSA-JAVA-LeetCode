class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current_sum = 0;

        for(int  i = 0; i < k; i++)
            current_sum = current_sum + nums[i];
        
        int maximum_sum = current_sum;

        int start_index = 0;
        int end_index = k;

        while(end_index < nums.length){
            current_sum = current_sum - nums[start_index];
            start_index++;

            current_sum = current_sum + nums[end_index];
            end_index++;

            maximum_sum = Math.max(maximum_sum, current_sum);
        }

        return (double) maximum_sum / k;
    }
}