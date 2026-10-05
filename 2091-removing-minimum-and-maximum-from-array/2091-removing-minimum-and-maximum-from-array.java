class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
            if (nums[i] < nums[minIndex]) minIndex = i;
        }
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int a = maxIndex + 1;
        int b = n - minIndex;
        int c = (minIndex + 1) + (n - maxIndex);
        return Math.min(a, Math.min(b, c));
    }
}
