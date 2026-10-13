class Solution {
    public boolean uniformArray(int[] nums1) {
        return canMake(nums1, 0) || canMake(nums1, 1);
    }

    private boolean canMake(int[] nums1, int i) {
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (i % 2 == 1)
                minOdd = Math.min(minOdd, x);
            else
                minEven = Math.min(x, minEven);
        }
        for (int x : nums1) {
            int curPar = x % 2;
            if (curPar == i)
                continue;
            int needPar = curPar ^ i;
            if (needPar == 0) {
                if (minEven == Integer.MAX_VALUE || minEven >= x)
                    return false;
            } else {
                if (minOdd == Integer.MAX_VALUE || minOdd >= x)
                    return false;
            }
        }
        return true;
    }
}