class Solution {
    public boolean checkString(String s) {
        boolean state = true;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                state = false;
            }
            else if(s.charAt(i) == 'a' && state == false){
                return false;
            }
        }
        return true;
    }
}