class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : gifts) {
            pq.add(i);
            ans += i;
        }
        for (int i = 0; i < k; i++) {
            int remove = pq.poll();
            int con = (int) Math.sqrt(remove);
            pq.add(con);
            ans -= (remove - con);
        }
        return ans;
    }
}