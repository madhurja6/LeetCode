class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        while (i < n && nums[i] == 0) {
            i++;
        }
        int streak = 0;
        for (int j = i + 1; j < n; j++) {
            if (nums[j] == 0)
                streak++;
            else {
                if (streak < k)
                    return false;
                streak = 0;
            }
        }
        return true;
    }
}