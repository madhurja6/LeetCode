class Solution {
    public int maximumProduct(int[] nums) {
        Queue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> pq2 = new PriorityQueue<>();
        for (int i : nums) {
            pq1.add(i);
            pq2.add(i);
        }
        int a = pq1.poll();
        return Math.max(a * pq1.poll() * pq1.poll(), a * pq2.poll() * pq2.poll());
    }
}