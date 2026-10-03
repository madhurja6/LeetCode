class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> b[0] - a[0]
        );
        int max = Integer.MIN_VALUE;
        for (int[] p : points) {
            int xj = p[0], yj = p[1];
            while (!pq.isEmpty() && xj - pq.peek()[1] > k) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                int best = pq.peek()[0];
                max = Math.max(max, best + yj + xj);
            }
            pq.offer(new int[] { yj - xj, xj });
        }
        return max;
    }
}