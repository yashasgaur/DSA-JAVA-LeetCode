class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != '*'){
                sb.append(arr[i]);
            }
            else if(arr[i] == '*'){
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}