class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            char starting = s.charAt(start); 
            char ending = s.charAt(end);

            if(!Character.isLetterOrDigit(starting)){
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(ending)){
                end--;
                continue;
            }

            if(Character.toLowerCase(starting) != Character.toLowerCase(ending)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}