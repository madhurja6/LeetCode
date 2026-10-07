class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        Set<Long> guardSet = new HashSet<>();
        Set<Long> wallSet = new HashSet<>();
        Set<Long> seen = new HashSet<>();
        for (int[] g : guards)
            guardSet.add(((long) g[0] << 32) | g[1]);
        for (int[] w : walls)
            wallSet.add(((long) w[0] << 32) | w[1]);
        for (int[] g : guards) {
            int i = g[0], j = g[1];
            for (int y = j + 1; y < n; y++) {
                long key = ((long) i << 32) | y;
                if (wallSet.contains(key) || guardSet.contains(key))
                    break;
                seen.add(key);
            }
            for (int y = j - 1; y >= 0; y--) {
                long key = ((long) i << 32) | y;
                if (wallSet.contains(key) || guardSet.contains(key))
                    break;
                seen.add(key);
            }
            for (int x = i + 1; x < m; x++) {
                long key = ((long) x << 32) | j;
                if (wallSet.contains(key) || guardSet.contains(key))
                    break;
                seen.add(key);
            }
            for (int x = i - 1; x >= 0; x--) {
                long key = ((long) x << 32) | j;
                if (wallSet.contains(key) || guardSet.contains(key))
                    break;
                seen.add(key);
            }
        }
        long total = (long) m * n;
        long guarded = seen.size();
        long occupied = guardSet.size() + wallSet.size();
        return (int) (total - guarded - occupied);
    }
}