class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (right == left) {
                res[i] = arr[left];
            } else {
                res[i] = arr[left];
                for (int j = left; j < right; j++) {
                    res[i] = res[i] ^ arr[j + 1];
                }
            }
        }
        return res;
    }
}