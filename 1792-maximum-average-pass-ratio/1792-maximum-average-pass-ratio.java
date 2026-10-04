class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(b[0], a[0]));
        for (int[] c : classes) {
            double p = c[0];
            double t = c[1];
            double gain = ((p + 1) / (t + 1)) - (p / t);
            pq.add(new double[] { gain, p, t });
        }
        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            double gain = top[0];
            double p = top[1];
            double t = top[2];
            p++;
            t++;
            double newGain = ((p + 1) / (t + 1)) - (p / t);
            pq.add(new double[] { newGain, p, t });
        }
        double sum = 0;
        for (double[] data : pq) {
            double p = data[1];
            double t = data[2];
            sum += p / t;
        }
        return sum / classes.length;
    }
}