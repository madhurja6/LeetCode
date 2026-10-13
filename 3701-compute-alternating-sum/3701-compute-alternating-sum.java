class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i++];
            if (i < n)
                sum -= nums[i];
        }
        return sum;
    }
}