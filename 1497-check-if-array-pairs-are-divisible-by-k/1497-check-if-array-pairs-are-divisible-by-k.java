class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] x = new int[k];
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            x[rem]++;
        }
        if (x[0] % 2 != 0) return false;
        for (int i = 1; i <= k / 2; i++) {
            int op = k - i;
            if (x[i] != x[op]) return false;
        }
        return true;
    }
}