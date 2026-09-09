class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closeSum = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int curSum = nums[i] + nums[left] + nums[right];
                if (curSum == target)
                    return curSum;
                if (Math.abs(target - curSum) < Math.abs(target - closeSum))
                    closeSum = curSum;
                if (curSum < target) {
                    left++;
                } else
                    right--;
            }
        }
        return closeSum;
    }
}