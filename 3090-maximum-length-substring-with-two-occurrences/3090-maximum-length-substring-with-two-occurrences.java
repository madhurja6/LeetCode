class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0, j = 0, res = 0;
        int arr[] =new int[26];
        while (i < s.length()) {
            char ch = s.charAt(i);
            arr[ch-'a']++;
            while (arr[ch-'a'] > 2) {
                char l = s.charAt(j);
                arr[l-'a']--;
                j++;
            }
            res = Math.max(res, i - j + 1);
            i++;
        }
        return res;
    }
}