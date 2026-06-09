class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1) return '0';
        return rec(n).charAt(k- 1);
    }

    static String rec(int x){
        
        if(x == 1) return "0";

        return rec(x - 1) + "1" + reverse(inverse(rec(x - 1)));
    }

    static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    static String inverse(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}