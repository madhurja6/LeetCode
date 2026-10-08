class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long max = 0;
        for (int i : nums) {
            pq.offer(i);
        }
        while (k > 0) {
            int val = pq.poll();
            max += val;
            pq.offer((int) Math.ceil(val / 3.0));
            k--;
        }
        return max;
    }
}