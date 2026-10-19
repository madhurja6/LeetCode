class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
                flag = true;
            } else {
                if (flag == true)
                    break;
            }
        }
        return list;
    }
}