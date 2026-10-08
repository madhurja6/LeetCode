class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] st = sentence.split(" ");
        int len = st[0].length() - 1;
        int n = st.length;
        for (int i = 1; i < n; i++) {
            if (st[i - 1].charAt(len) != st[i].charAt(0)) return false;
            len = st[i].length() - 1;
        }
        return st[n - 1].charAt(len) == st[0].charAt(0);
    }
}