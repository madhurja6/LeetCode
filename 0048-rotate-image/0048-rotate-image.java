class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        int a = 0;
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = list.get(a++);
            }
        }
    }
}