class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sumofdig(nums[i]))
                return i;
        }
        return -1;
    }

    private static int sumofdig(int i) {
        if (i == 0)
            return 0;
        return i % 10 + sumofdig(i / 10);
    }
}