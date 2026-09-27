class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < n2; i++) {
            map.put(nums2[i], i);
        }
        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            int key = map.get(nums1[i]);
            int flag = 0;
            if (key < n2 - 1) {
                for (int j = key + 1; j < n2; j++) {
                    if (nums2[j] > nums1[i]) {
                        ans[i] = nums2[j];
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    ans[i] = -1;
            } else
                ans[i] = -1;
        }
        return ans;
    }
}