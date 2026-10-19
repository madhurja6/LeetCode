class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList();
        int smallCount = 0;
        int targetCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target)
                smallCount++;
            if (nums[i] == target)
                targetCount++;
        }
        for (int i = smallCount; i < (smallCount + targetCount); i++)
            list.add(i);
        return list;
    }
}