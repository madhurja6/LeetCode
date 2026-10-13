class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            int len = s.length();
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += weights[s.charAt(i) - 'a'];
            }
            sum %= 26;
            sb.append((char) ('z' - sum));
        }
        return sb.toString();
    }
}