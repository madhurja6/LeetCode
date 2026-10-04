class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for (int i : gain) {
            ans = Math.max(ans, sum);
            sum += i;
        }
        ans = Math.max(ans, sum);
        return ans;
    }
}