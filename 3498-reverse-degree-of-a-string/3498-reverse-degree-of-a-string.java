class Solution {
    public int reverseDegree(String s) {
        char[] str = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += ((26 - (str[i] - 'a')) * (i + 1));
        }
        return sum;
    }
}