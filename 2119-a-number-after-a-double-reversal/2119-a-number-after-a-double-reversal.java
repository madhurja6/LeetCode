class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1=palin(num);
        int reverse2=palin(reverse1);
        return num==reverse2;
    }
    private static int palin(int n) {
        if (n == 0) {
            return n;
        }
        int dig = digit(n);
        return n % 10 * (int) Math.pow(10, dig-1) + palin(n / 10);
    }

    private static int digit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + digit(n / 10);
    }
}