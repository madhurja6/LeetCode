class Solution {
    public int minimumOperations(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            if (i > 0)
                pq.add(i);
        }
        int operations = 0;
        int n = nums.length;
        while (!pq.isEmpty()) {
            int sub = pq.peek();
            pq.clear();
            for (int i = 0; i < n; i++) {
                nums[i] -= sub;
                if (nums[i] > 0)
                    pq.add(nums[i]);
            }
            operations++;
        }
        return operations;
    }
}