class Solution {
    public int xorOperation(int n, int start) {
        int ans = start + 2 * 0;
        int i = 1;
        while (i < n) {
            ans ^= start + 2 * i;
            i++;
        }
        return ans;
    }
}