class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        return binary_search(nums);
    }

    private static int binary_search(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}