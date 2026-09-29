class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        int count = 0;
        for (char c : s) {
            if (found(j, c))
                count++;
        }
        return count;
    }

    private boolean found(char[] j, char c) {
        for (char ch : j) {
            if (ch == c)
                return true;
        }
        return false;
    }
}