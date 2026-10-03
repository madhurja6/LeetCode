class Solution {
    public int numSub(String s) {
        char[] str = s.toCharArray();
        long streak = 0;
        long count = 0;
        for (char c : str) {
            if (c == '1') {
                streak++;
            } else {
                count += streak * (streak + 1) / 2;
                streak = 0;
            }
        }
        count += streak * (streak + 1) / 2;
        return (int) (count % 1000000007);
    }
}