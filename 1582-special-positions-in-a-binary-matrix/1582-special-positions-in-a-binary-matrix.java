class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int n = mat.length, m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    if (check(mat, i, j))
                        count++;
                }
            }
        }
        return count;
    }

    private boolean check(int[][] mat, int i, int j) {
        int a = i - 1, b = j - 1;
        int n = mat.length, m = mat[0].length;
        while (a >= 0) {
            if (mat[a][j] == 1)
                return false;
            a--;
        }
        while (b >= 0) {
            if (mat[i][b] == 1)
                return false;
            b--;
        }
        for (int k = i + 1; k < n; k++) {
            if (mat[k][j] == 1)
                return false;
        }
        for (int k = j + 1; k < m; k++) {
            if (mat[i][k] == 1)
                return false;
        }
        return true;
    }
}