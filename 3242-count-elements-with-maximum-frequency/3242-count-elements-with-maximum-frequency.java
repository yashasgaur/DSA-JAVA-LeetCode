class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int max_freq = 0;

        for(int freq : map.values()){
            max_freq = Math.max(freq, max_freq);
        }

        int ans = 0;

        for(int freq : map.values()){
            if(freq == max_freq){
                ans += freq;
            }
        }

        return ans;
    }
}