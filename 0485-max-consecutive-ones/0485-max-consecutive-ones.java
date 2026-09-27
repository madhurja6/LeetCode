class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxStreak = 0;
        int streak = 0;
        for (int i : nums) {
            if (i == 1)
                streak++;
            else {
                maxStreak = Math.max(streak, maxStreak);
                streak = 0;
            }
        }
        return Math.max(streak, maxStreak);
    }
}