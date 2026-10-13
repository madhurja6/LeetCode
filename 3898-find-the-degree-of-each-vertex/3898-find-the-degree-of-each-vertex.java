class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix[0].length;
        int[] ans = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j] += matrix[i][j];
            }
        }
        return ans;
    }
}