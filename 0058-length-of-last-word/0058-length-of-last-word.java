class Solution {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int x = s.lastIndexOf(" ");
        int length = s.length();
        x = length - x - 1;
        return x;
    }
}