class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        rec(n, 0, 0, sb, list);

        return list;
    }

    static void rec(int n, int open, int close, StringBuilder sb,      List<String> list) {

        if (sb.length() == 2 * n) {
            list.add(sb.toString());
            return;
        }

        if (open < n) {
            sb.append('(');
            rec(n, open + 1, close, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            rec(n, open, close + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}