class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int eq = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n))
                eq++;
        }
        if (k == eq)
            return n - eq;
        if (k == eq - 1)
            return eq;
        return 0;
    }
}