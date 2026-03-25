import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == majority)
                votes++;
            
            else if(nums[i] != majority){
                votes--;

                if(votes == 0){
                    majority = nums[i];
                    votes++;
                }
            }
        }

        return majority;
    }
}