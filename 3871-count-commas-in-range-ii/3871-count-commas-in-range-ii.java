class Solution {
    public long countCommas(long n) {
        long[] arr = { 1000L, 1000000L, 1000000000L, 1000000000000L, 1000000000000000L, 1000000000000000000L };
        long total = 0;
        for (int i = 1; i <= 5; i++) {
            long low = arr[i - 1];
            long hi = arr[i];
            if (n < low)
                break;
            long count = Math.min(n, hi - 1) - low + 1;
            total += (count * i);
        }
        return total;
    }
}