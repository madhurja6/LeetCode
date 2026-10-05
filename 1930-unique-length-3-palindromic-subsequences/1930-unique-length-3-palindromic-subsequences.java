class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int ans = 0;
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        char[] s1 = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int c = s1[i] - 'a';
            if (first[c] == -1)
                first[c] = i;
            last[c] = i;
        }
        for (int c = 0; c < 26; c++) {
            if (first[c] != -1 && last[c] > first[c]) {
                HashSet<Character> middle = new HashSet<>();
                for (int k = first[c] + 1; k < last[c]; k++) {
                    if (middle.size() != 26)
                        middle.add(s1[k]);
                    else
                        break;
                }
                ans += middle.size();
            }
        }
        return ans;
    }

}