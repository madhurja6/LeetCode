class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int j=0;
        int minlen=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
        while (sum>=target){
            minlen= Math.min(i-j+1,minlen);
            sum-=nums[j++];
          }
        }
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}