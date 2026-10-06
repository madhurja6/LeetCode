class Solution {
    public int minimumCost(int[] cost) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : cost) {
            pq.add(i);
        }
        int sum = 0;
        for (int i = 0; i < cost.length; i++) {
            sum += pq.poll();
            i++;
            if (i < cost.length)
                sum += pq.poll();
            if (!pq.isEmpty())
                pq.poll();
            i++;
        }
        return sum;
    }
}