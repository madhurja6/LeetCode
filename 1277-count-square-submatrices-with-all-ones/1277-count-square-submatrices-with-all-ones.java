class Solution {
    static int n = 0;
    static int m = 0;

    public static int countSquares(int[][] matrix) {
        int count = 0;
        n = matrix.length;
        m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                    count += isSquare(matrix, i, j, 1);
                }
            }
        }
        return count;
    }

    private static int isSquare(int[][] matrix, int a, int b, int k) {
        if (a + k >= n || b + k >= m)
            return 0;
        for (int i = a; i <= a + k; i++) {
            for (int j = b; j <= b + k; j++) {
                if (matrix[i][j] == 0)
                    return 0;
            }
        }
        return 1 + isSquare(matrix, a, b, k + 1);
    }
}