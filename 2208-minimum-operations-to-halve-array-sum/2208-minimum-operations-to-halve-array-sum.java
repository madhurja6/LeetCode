class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        double sum = 0;
        for (int x : nums) {
            sum += x;
            pq.offer((double) x);
        }
        double target = sum / 2;
        int operations = 0;
        while (sum > target) {
            double orig = pq.poll();
            double half = orig / 2;
            sum -= half;
            pq.offer(half);
            operations++;
        }
        return operations;
    }
}