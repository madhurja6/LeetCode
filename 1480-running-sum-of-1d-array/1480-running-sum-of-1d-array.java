class Solution {
    public int[] runningSum(int[] nums) {
        int []x=new int [nums.length];
        int i=0,sum=0;
        while(i<nums.length){
            sum+=nums[i];
            x[i++]=sum;
        }
        return x;
    }
}