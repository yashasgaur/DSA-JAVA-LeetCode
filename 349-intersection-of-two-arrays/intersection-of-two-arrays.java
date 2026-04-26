class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums2[i] == nums1[j] && !(list.contains(nums2[i]))){
                    list.add(nums2[i]);
                }
            }
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}