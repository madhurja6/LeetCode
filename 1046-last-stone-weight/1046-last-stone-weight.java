class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.offer(i);
        }
        while (!pq.isEmpty() && pq.size() > 1) {
            int x = pq.poll(), y = pq.poll();
            if (x != y)
                pq.offer(Math.abs(y - x));
        }
        if (pq.isEmpty())
            return 0;
        else
            return pq.poll();
    }
}