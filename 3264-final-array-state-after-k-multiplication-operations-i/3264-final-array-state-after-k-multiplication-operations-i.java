class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i : nums)
            pq.offer(i);
        for (int i = 0; i < k; i++) {
            int val = pq.poll();
            for (int j = 0; j < nums.length; j++) {
                if (val == nums[j]) {
                    val *= multiplier;
                    nums[j] = val;
                    break;
                }
            }
            pq.offer(val);
        }
        return nums;
    }
}