class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long leftSum = 0;
        long rightSum = 0;
        int count = 0;
        int r = n / 2;
        for (int i = 0; i < r; i++) {
            leftSum += nums[i];
            rightSum += nums[i + r];
        }
        if (leftSum > rightSum)
            count++;
        for (int i = 0; i < n - 1; i++) {
            leftSum -= nums[i];
            rightSum += nums[i];
            leftSum += nums[(r % n)];
            rightSum -= nums[(r % n)];
            if (leftSum > rightSum)
                count++;
            r++;
        }
        return count;
    }
}