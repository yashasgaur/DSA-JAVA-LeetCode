class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for(int n2 : nums2){
            set.add(n2);
        }

        List<Integer> list = new ArrayList<>();

        for(int n1 : nums1){
            if(set.contains(n1)){
                list.add(n1);
                set.remove(n1);
            }
        }
        
        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}