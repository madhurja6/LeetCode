class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int n = nums.length - 1;
        int diff = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            diff += nums[i];
            sum -= nums[i];
            if ((sum - diff) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}