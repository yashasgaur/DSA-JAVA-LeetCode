class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));


            if(left != right){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}