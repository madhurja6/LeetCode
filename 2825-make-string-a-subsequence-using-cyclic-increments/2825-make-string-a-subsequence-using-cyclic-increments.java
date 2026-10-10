class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int index1=0;
        int index2=0;
        int n=str1.length();
        int m=str2.length();
        if (m>n) return false;
        while (index1 < n && index2 < m) {
            char s1 = str1.charAt(index1);
            char s2 = str2.charAt(index2);
            if (s1 == s2 || s1 == s2 - 1 || s1 == 'z' && s2 == 'a') {
                index2++;
            }
            index1++;
        }
        return m==index2;
    }
}