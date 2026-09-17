class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        int n = board.length;
        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < n; j += 3) {
                if (!gridCheck3x3(board, i, j)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set1.contains(board[i][j])) {
                    return false;
                } else {
                    if (board[i][j] != '.') {
                        set1.add(board[i][j]);
                    }
                }
                if (set2.contains(board[j][i])) {
                    return false;
                } else {
                    if (board[j][i] != '.') {
                        set2.add(board[j][i]);
                    }
                }
            }
            set1.clear();
            set2.clear();
        }
        return true;
    }

    private static boolean gridCheck3x3(char[][] board, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int k = i; k < i + 3; k++) {
            for (int k2 = j; k2 < j + 3; k2++) {
                if (set.contains(board[k][k2])) {
                    return false;
                } else {
                    if (board[k][k2] != '.') {
                        set.add(board[k][k2]);
                    }
                }
            }
        }
        return true;
    }
}