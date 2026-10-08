class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] is : grid) {
            Arrays.sort(is);
        }
        int m = grid[0].length;
        int n = grid[0].length - 1;
        int sum = 0;
        for (int i = 0; i < m && n >= 0; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int[] is : grid) {
                pq.add(is[n]);
            }
            sum += pq.poll();
            n--;
        }
        return sum;
    }
}