class Solution {
    public int countCollisions(String directions) {
        int n = directions.length(), ans = 0, l = 0, r = n - 1;
        char[] d = directions.toCharArray();
        while (l < n && d[l] == 'L')
            l++;
        while (r >= l && d[r] == 'R')
            r--;
        for (int i = l; i <= r; i++) {
            if (d[i] != 'S')
                ans++;
        }
        return ans;
    }
}