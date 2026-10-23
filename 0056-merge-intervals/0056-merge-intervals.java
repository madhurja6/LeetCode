class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int a[] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (a[1] >= intervals[i][0]) {
                a[1] = Math.max(a[1], intervals[i][1]);
            } else {
                list.add(a);
                a = intervals[i];
            }
        }
        list.add(a);
        return list.toArray(new int[list.size()][]);
    }
}