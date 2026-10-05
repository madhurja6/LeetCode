class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int[] x = new int[n];
        int j = 0;
        int m = nums.length;
        for (int i = 0; i < n; i++) {
            x[i] = nums[j];
            j++;
            if (j == m)
                j = 0;
        }
        return x;
    }
}