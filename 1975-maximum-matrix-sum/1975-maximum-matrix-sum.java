class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long maxSum = 0;
        int negCount = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                maxSum += Math.abs(val);
                if (val < 0) {
                    negCount++;
                }
                minVal = Math.min(minVal, Math.abs(val));
            }
        }
        if (negCount % 2 == 0) {
            return maxSum;
        } else
            return maxSum - 2 * minVal;
    }
}