import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        int[] nums1Copy = nums1.clone();
        int[] nums2Copy = nums2.clone();
        java.util.Arrays.sort(nums1Copy);
        java.util.Arrays.sort(nums2Copy);
        int i = 0, j = 0;
        while (i < nums1Copy.length && j < nums2Copy.length) {
            if (nums1Copy[i] < nums2Copy[j]) {
                i++;
            } else if (nums1Copy[i] > nums2Copy[j]) {
                j++;
            } else {
                intersection.add(nums1Copy[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        return result;
    }
}
