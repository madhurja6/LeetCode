class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int maxSub = 0;
        int curSub = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxSub = 1;
                curSub = 1;
            } else if (maxVal == nums[i]) {
                curSub += 1;
                maxSub = Math.max(maxSub, curSub);
            } else {
                curSub = 0;
            }
        }
        return maxSub;
    }
}