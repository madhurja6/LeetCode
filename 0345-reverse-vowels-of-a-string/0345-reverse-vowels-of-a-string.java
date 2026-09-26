class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (char ch : a) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                sb.append(ch);
            }
        }
        sb.reverse();
        char[] b = sb.toString().toCharArray();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                sb1.append(b[j++]);
            } else {
                sb1.append(ch);
            }
        }
        return sb1.toString();
    }
}