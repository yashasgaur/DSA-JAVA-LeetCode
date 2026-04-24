class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int curr_sum = 0;

        for(int i = 0; i < nums.length; i++){
            curr_sum += nums[i];
            arr[i] = curr_sum;
        }

        return arr;
    }
}