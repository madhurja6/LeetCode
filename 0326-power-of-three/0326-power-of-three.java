class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0 || n == Integer.MAX_VALUE)
            return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}