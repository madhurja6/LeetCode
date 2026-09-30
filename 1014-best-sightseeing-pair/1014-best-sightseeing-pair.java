class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0;
        int n = values.length;
        int left = values[0] + 0;
        for (int j = 1; j < n; j++) {
            int right = values[j] - j;
            res = Math.max(res, left + right);
            left = Math.max(left, values[j] + j);
        }
        return res;
    }
}