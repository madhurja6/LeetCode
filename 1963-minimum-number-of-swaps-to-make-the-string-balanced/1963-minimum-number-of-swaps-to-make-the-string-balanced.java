class Solution {
    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int swaps = 0;
        for (char i : arr) {
            if (i == '[') swaps++;
            else {
                if (swaps > 0) swaps--;
            }
        }
        return (swaps + 1) / 2;
    }
}