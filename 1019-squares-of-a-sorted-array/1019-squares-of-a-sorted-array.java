class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = arr.length - 1;
        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                arr[index] = nums[right] * nums[right];
                right--;
            }
            else{
                arr[index] = nums[left] * nums[left];
                left++;
            }
            index--;  
        }

        return arr;
    }
}