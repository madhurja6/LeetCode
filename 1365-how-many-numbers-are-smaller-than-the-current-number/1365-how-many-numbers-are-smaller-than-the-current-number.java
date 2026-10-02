class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] x = new int[n];
        int[] ans = new int[n];
        x = Arrays.copyOf(nums, n);
        Arrays.sort(x);
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(x[i]))
                map.put(x[i], i);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}