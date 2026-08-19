class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int compliment = target - numbers[i];

            if(map.containsKey(compliment)){
                arr[0] = map.get(compliment) + 1;
                arr[1] = i + 1;
                break;
            }
            else{
                map.put(numbers[i], i);
            }
        }
        return arr;
    }
}