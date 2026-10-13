class Solution {
    public String reversePrefix(String s, int k) {
        char[] str = s.toCharArray();
        int i = 0;
        k-=1;
        while (i < k) {
            char ch = str[i];
            str[i] = str[k];
            str[k] = ch;
            i++;
            k--;
        }
        return new String(str);
    }
}