class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []x=new int[nums.length];
        int i=0;
        while(i<nums.length){
            int left=0,right=nums.length-1;
            int leftsum=0,rightsum=0;
            while(left<i){
                leftsum+=nums[left];
                left++;
            }
            while(right>i){
                rightsum+=nums[right];
                right--;
            }
            int ans=leftsum-rightsum;
            if(ans<0) x[i++]=ans*(-1);
            else x[i++]=ans;
        }
        return x;
    }
}