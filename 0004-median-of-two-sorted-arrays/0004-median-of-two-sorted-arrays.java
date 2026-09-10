class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m + n];
        int k = 0;
        for (int i : nums1)
            merge[k++] = i;
        for (int i : nums2)
            merge[k++] = i;
        Arrays.sort(merge);
        if (merge.length % 2 == 0) {
            int a = merge[merge.length / 2] + merge[merge.length / 2 - 1];
            return (double) a / 2.0;
        } else {
            return (double) (merge[merge.length / 2]);
        }
    }
}