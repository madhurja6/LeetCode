class Solution {
    public static int countSeniors(String[] details) {
        int n = 0;
        for (String i :details) {
            if ((i.charAt(11) * 10) + i.charAt(12) > 588) {
                n++;
            }
        }
        return n;
    }
}