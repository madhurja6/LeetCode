class Solution {
    public int numDistinct(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int m = s1.length;
        int n = t1.length;
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1[i - 1] == t1[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[m][n];
    }
}