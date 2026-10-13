class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = -1;
        int num = 101;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && num > capacity[i]) {
                ans = i;
                num = capacity[i];
            }
        }
        return ans;
    }
}