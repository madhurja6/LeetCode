class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length==1 && k==1 ) return nums[0];
        double avg = Integer.MIN_VALUE;
        int i = 0, j = k;
        while (j <= nums.length) {
            int sum = 0;
            while (i < j) {
                sum += nums[i];
                i++;
            }
         //   if ((double) sum / k > avg) avg = (double) sum / k;
            avg=Math.max((double) sum / k , avg);
            j++;
            i = j - k;
        }
        return avg;
    }
}