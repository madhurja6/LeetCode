class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i : nums) {
            cursum += i;
            maxsum = Math.max(maxsum, cursum);
            if (cursum < 0)
                cursum = 0;
        }
        return maxsum;
    }
}