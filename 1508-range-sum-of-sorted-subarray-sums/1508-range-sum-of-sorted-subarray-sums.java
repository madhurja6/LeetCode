class Solution {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] newarr = new int[n * (n + 1) / 2];
        final int mid = (int) 1e9 + 7;
        int index = 0, sum;
        for (int x = 0; x < nums.length; x++) {
            sum = 0;
            int i = x;
            while (i < nums.length) {
                sum += nums[i];
                newarr[index] = sum;
                index++;
                i++;
            }
        }
        Arrays.sort(newarr);
        sum = 0;
        while (left <= right) {
            sum =(sum + newarr[left - 1]) % mid;
            left++;
        }
        return sum;
    }
}