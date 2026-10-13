class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int right = n - 2;
        long sum = 0;
        int i = 0;
        while(i < right){
            sum += (nums[right]);
            right -= 2;
            i++;
        }
        return sum;
    }
}