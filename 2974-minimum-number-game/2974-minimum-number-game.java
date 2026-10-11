class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Queue<Integer> pq = new PriorityQueue<>();
        int ans[] = new int[n];
        for (int i : nums) {
            pq.add(i);
        }
        for (int i = 0; i < n; i++) {
            ans[i + 1] = pq.poll();
            ans[i++] = pq.poll();
        }
        return ans;
    }
}