class Solution {
    public int[] buildArray(int[] nums) {
        int []x=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            x[i]=nums[nums[i]];
        }
        return x;
    }
}