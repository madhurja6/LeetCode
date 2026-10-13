class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = 2 * nums.length;
        int rev[] = new int[n];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            rev[index++] = nums[i];
            rev[--n] = nums[i];
        }
        return rev;
    }
}