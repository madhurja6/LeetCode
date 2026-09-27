class Solution {
    public int longestPalindrome(String s) {
        int[] small = new int[26];
        int[] capital = new int[26];
        char[] s1 = s.toCharArray();

        boolean hasOdd = false;
        int count = 0;

        for (char c : s1) {
            if (c >= 'A' && c <= 'Z') {
                capital[c - 'A']++;
            } else {
                small[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            int t = small[i];
            if (t % 2 == 0) {
                count += t;
            } else {
                count += t - 1;
                hasOdd = true;
            }
            t = capital[i];
            if (t % 2 == 0) {
                count += t;
            } else {
                count += t - 1;
                hasOdd = true;
            }

        }
        return hasOdd ? count + 1 : count;
    }
}