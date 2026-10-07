class Solution {
    public int fillCups(int[] amount) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : amount) {
            pq.offer(i);
        }
        int time = 0;
        while (!pq.isEmpty() && pq.peek() > 0) {
            time++;
            int a = pq.poll() - 1;
            if (!pq.isEmpty()) {
                int b = pq.poll() - 1;
                if (b > 0)
                    pq.offer(b);
            }
            pq.offer(a);
        }
        return time;
    }
}