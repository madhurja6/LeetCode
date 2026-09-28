class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else
                ans[0] = i;
        }
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if(!set.contains(i)) {
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}