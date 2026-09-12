class Solution {
   public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxA = 0;
        int currectA = 0;
        while (i < j) {
            currectA = Math.min(height[i], height[j]) * (j - i);
            maxA = Math.max(maxA, currectA);
            if (height[i] <= height[j]) {
                i++;
            } else j--;
        }
        return maxA;
    }
}