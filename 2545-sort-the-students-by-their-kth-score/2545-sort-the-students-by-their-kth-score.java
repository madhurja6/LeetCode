class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = score.length;
        for (int i = 0; i < n; i++) {
            pq.add(score[i][k]);
        }
        int row = 0;
        for (int i = 0; i < n; i++) {
            int val = pq.poll();
            for (int j = 0; j < n; j++) {
                if (score[j][k] == val) {
                    int[] rowFound = Arrays.copyOf(score[j], score[0].length);
                    int[] rowTop = Arrays.copyOf(score[row], score[0].length);
                    score[row] = rowFound;
                    score[j] = rowTop;
                    row++;
                    break;
                }
            }
        }
        return score;
    }
}