class Solution {
    public int maximumScore(int a, int b, int c) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        int count = 0;
        while (pq.size() > 1) {
            int t1 = pq.poll();
            int t2 = pq.poll();
            if (t1 > 0 && t2 > 0) {
                count++;
                pq.offer(--t1);
                pq.offer(--t2);
            } else
                break;
        }
        return count;
    }
}