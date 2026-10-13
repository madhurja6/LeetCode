class Solution {
    public boolean checkDivisibility(int n) {
        int dsum = digOfSum(n);
        int dpro = proOfDig(n);
        return n % (dsum + dpro) == 0;
    }

    private int proOfDig(int n) {
        if (n == 0)
            return 1;
        if (n % 10 == 0)
            return 0;
        else
            return n % 10 * proOfDig(n / 10);
    }

    private int digOfSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + digOfSum(n / 10);
    }
}