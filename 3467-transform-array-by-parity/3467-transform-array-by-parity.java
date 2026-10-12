class Solution {
    public int[] transformArray(int[] nums) {
        int zero = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0)
                zero++;
        }
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < n; i++) {
            nums[i] = 1;
        }
        return nums;
    }
}