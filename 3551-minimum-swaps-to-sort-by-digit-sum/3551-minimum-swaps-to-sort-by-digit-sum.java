class Solution {
    public int minSwaps(int[] nums) {
       int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            int sumA = sumOfDig(a[0]);
            int sumB = sumOfDig(b[0]);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a[0], b[0]);
        });
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1];
                cycleSize++;
            }
            if (cycleSize > 0) {
                swaps += cycleSize - 1;
            }
        }
        return swaps;
    }

    private static int sumOfDig(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDig(n / 10);
    }
}