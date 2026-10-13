class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        while (n > 0) {
            int t = n % 10;
            ans += t;
            n /= 10;
        }
        return ans;
    }
}