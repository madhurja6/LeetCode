class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int []x={-1,-1};
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                x[0]=i;
                break;
            }
        }
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]==target){
                x[1]=i;
                break;
            }
        }
        return x;
    }

}