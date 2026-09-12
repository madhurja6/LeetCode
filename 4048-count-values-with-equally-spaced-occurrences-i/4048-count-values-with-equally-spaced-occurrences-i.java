class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[101];
        int count = 0;
        for (int i : nums) {
            arr[i]++;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    if ((j + (j - i)) < n && nums[j] == nums[j + (j - i)] && arr[nums[i]] == 3) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}