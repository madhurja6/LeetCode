class Solution {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        int ans[] = new int[n];
        int count = 2;
        for (int i = 2; i * i < n; i++) {
            if (ans[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    if (ans[j] == 0) {
                        ans[j] = 1;
                        count++;
                    }
                }
            }
        }
        return n - count;
    }
}