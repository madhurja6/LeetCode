class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return arr[a[0]] * arr[b[1]] - arr[b[0]] * arr[a[1]];
        });
        for (int i = 0; i < n - 1; i++) {
            pq.offer(new int[] { i, n - 1 });
        }
        while (k > 1) {
            int[] top = pq.poll();
            int i = top[0], j = top[1];
            if (i < j - 1) {
                pq.offer(new int[] { i, j - 1 });
            }
            k--;
        }
        int[] res = pq.poll();
        return new int[] { arr[res[0]], arr[res[1]] };
    }

}