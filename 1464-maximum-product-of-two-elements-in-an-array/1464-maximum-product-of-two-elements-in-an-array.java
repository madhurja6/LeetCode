class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max1 = -1;
        int max2 = -1;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (max1 <= num) {
                max2 = max1;
                max1 = num;
            } else if (num < max1 && num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}