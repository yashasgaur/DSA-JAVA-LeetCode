class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        rec(s, i, j);
    }

    static void rec(char[] s, int i, int j){
        if(i > j) return;

        swap(s, i, j);
        rec(s, i + 1, j - 1);
    }

    static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}