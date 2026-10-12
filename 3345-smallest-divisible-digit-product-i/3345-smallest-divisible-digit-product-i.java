class Solution {
    public int smallestNumber(int n, int t) {
        while (n <= 100) {
            if (proOfDig(n) % t == 0)
                break;
            n++;
        }
        return n;
    }

    private int proOfDig(int n) {
        if (n == 0)
            return 1;
        return n % 10 * proOfDig(n / 10);
    }
}