class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int ans[][] = new int[n][n];
        for (int[] is : queries) {
            for (int i = is[0]; i <= is[2]; i++) {
                for (int j = is[1]; j <= is[3]; j++) {
                    ans[i][j]++;
                }
            }
        }
        return ans;
    }
}