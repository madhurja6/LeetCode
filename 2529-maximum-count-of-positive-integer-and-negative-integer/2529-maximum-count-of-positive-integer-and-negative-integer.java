class Solution {
    public int maximumCount(int[] nums) {
        int min = 0;
        int max = 0;
        for (int i:nums){
            if (i<0) min++;
            else if (i>0) max++;
        }
        return Math.max(min,max);
    }
}