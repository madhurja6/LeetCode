class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    ans[i] = nums[j];
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] > nums[i]) {
                        ans[i] = nums[j];
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    ans[i] = -1;
            }
        }
        return ans;
    }
}