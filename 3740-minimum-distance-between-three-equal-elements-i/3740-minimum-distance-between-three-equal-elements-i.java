class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (List<Integer> list : map.values()) {
            for (int i = 0; i + 2 < list.size(); i++) {
                int distance = 2 * (list.get(i + 2) - list.get(i));
                ans = Math.min(ans, distance);
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}