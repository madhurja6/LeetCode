class Solution {
    public boolean isHappy(int n) {
        while (n / 10 != 0) {
            int sum = 0;
            int a = n;
            while (a > 0) {
                sum += (a % 10) * (a % 10);
                a /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }
}