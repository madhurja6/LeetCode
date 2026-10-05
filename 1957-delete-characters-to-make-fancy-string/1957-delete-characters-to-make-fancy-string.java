class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 1;
        char pre = s.charAt(0);
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (pre == cur) num++;
            else {
                num = 1;
            }
            if (num < 3) {
                sb.append(cur);
                pre = cur;
            }
        }
        return sb.toString();
    }
}