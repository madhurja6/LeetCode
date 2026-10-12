class Solution {
    static int n = 0;

    public static int[][] sortMatrix(int[][] grid) {
        n = grid.length;
        sort_bottomLeft(grid, 0, 0);
        for (int i = 1; i < n - 1; i++) {
            sort_topRight(grid, 0, i);
            sort_bottomLeft(grid, i, 0);
        }
        return grid;
    }

    private static void sort_bottomLeft(int[][] grid, int i, int j) {
        while (i < n && j < n) {
            int k = 1;
            while (i + k < n && j + k < n) {
                if (grid[i][j] < grid[i + k][j + k]) {
                    int t = grid[i][j];
                    grid[i][j] = grid[i + k][j + k];
                    grid[i + k][j + k] = t;
                }
                k++;
            }
            i++;
            j++;
        }
        return;
    }

    private static void sort_topRight(int[][] grid, int i, int j) {
        while (i < n && j < n) {
            int k = 1;
            while (i + k < n && j + k < n) {
                if (grid[i][j] > grid[i + k][j + k]) {
                    int t = grid[i][j];
                    grid[i][j] = grid[i + k][j + k];
                    grid[i + k][j + k] = t;
                }
                k++;
            }
            i++;
            j++;
        }
        return;
    }
}