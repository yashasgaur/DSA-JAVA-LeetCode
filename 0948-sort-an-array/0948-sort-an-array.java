class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }

    static int[] mergeSort(int[] nums){
        if(nums.length == 1) return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] combined = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                combined[k] = first[i];
                i++;
                k++;
            }
            else{
                combined[k] = second[j];
                j++;
                k++;
            }
        }

        while(i < first.length){
            combined[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            combined[k] = second[j];
            j++;
            k++;
        }
        return combined;
    }
}