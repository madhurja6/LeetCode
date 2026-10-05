class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int i : piles) {
            pq.offer(i);
            sum += i;
        }
        while (k-- > 0) {
            int t = pq.poll();
            if (t % 2 == 0) {
                int put = t / 2;
                pq.offer(put);
                sum -= put;
            } else {
                int put = t / 2 + 1;
                pq.offer(put);
                sum -= put - 1;
            }
        }
        return (int) sum;
    }
}