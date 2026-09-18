class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int lcol = 0, rcol = n - 1;
        int trow = 0, brow = n - 1;
        int count = 1;
        while (count <= n * n) {
            for (int i = lcol; i <= rcol; i++) {
                matrix[trow][i] = count++;
            }
            trow++;

            for (int i = trow; i <= brow; i++) {
                matrix[i][rcol] = count++;
            }
            rcol--;
            for (int i = rcol; i >= lcol; i--) {
                matrix[brow][i] = count++;
            }
            brow--;
            for (int i = brow; i >= trow; i--) {
                matrix[i][lcol] = count++;
            }
            lcol++;
        }
        return matrix;
    }
}