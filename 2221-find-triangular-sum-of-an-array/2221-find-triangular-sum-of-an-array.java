class Solution {
    public static int triangularSum(int[] nums) { 
        int len = nums.length - 1;
        int sum = Integer.MIN_VALUE;
        int j = 0;
        while (j < len) {
            int[] x = new int[len - j];
            for (int i = 0; i < nums.length - 1; i++) {
                x[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums=x;
            j++;
        }
        return nums[0];
    }
}