class Solution {
     public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        else if (x==Integer.MAX_VALUE) return 46340;
        else {
            int n = 1;
            for (int i = 1; i <= x / 2; i++) {
                if ((i * i) == x) {
                    n = i;
                    break;
                }
                if ((i * i) > x)
                    break;
                n = i;
            }
            return n;
        }
    }
}