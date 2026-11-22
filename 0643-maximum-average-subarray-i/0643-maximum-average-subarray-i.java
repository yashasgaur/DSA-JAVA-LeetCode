class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = 0;
        double max_avg = Integer.MIN_VALUE;
        double avg = 0;
        double sum = 0;

        while(end < nums.length){
            sum += nums[end];
            if(end - start + 1 == k){
                avg = sum / k;
                max_avg = Math.max(max_avg, avg);
                sum -= nums[start];
                start++;
            }           
            end++;
        }
        return max_avg;
    }
}