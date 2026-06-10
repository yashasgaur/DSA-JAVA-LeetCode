class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return rec(n, memo);
    }

    static int rec(int n, int[] memo){
        if(n == 1) return 1;
        if(n == 2) return 2;

        if(memo[n] != 0) return memo[n];
        
        int x = rec(n - 1, memo);
        int y = rec(n - 2, memo);

        return memo[n] = x + y;
    }
}