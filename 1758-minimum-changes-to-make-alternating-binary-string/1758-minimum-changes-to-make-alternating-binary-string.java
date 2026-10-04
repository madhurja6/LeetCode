class Solution {
    public int minOperations(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        return Math.min(count(str,n,0), count(str,n,1));
    }
    
    private int count(char[] str, int n, int a) {
        int count = 0;
        int i = 0;
        while (i < n) {
            a ^= 1;
            if (str[i] != a + '0') {
                count++;
            }
            i++;
        }
        return count;
    }
}