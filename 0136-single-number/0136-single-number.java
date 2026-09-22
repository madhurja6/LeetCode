class Solution {
    public static int singleNumber(int[] nums) {
        int x=0;
        int i=0;
        while (i<nums.length){
           x=x^nums[i];
            i++;
        }
        return x;
    }
}