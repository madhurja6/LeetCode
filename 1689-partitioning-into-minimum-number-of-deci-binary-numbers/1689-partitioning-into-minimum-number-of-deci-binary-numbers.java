class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        int m = n.length();
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}