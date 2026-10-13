class Solution {
    public int mirrorFrequency(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        int total = 0;
        boolean[] visited = new boolean[128];
        for (char c : s.toCharArray()) {
            if (visited[c])
                continue;
            char mir;
            if (Character.isLetter(c)) {
                mir = (char) ('a' + 'z' - c);
            } else {
                mir = (char) ('0' + '9' - c);
            }
            visited[c] = true;
            visited[mir] = true;
            if (c != mir) {
                total += Math.abs(freq[c] - freq[mir]);
            }
        }
        return total;
    }
}