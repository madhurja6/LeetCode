class Solution {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        int flag = 0;
        if (nums.length==1){
            int i=0;
            if (target <= nums[i]){
                return 0;
            }else {
                return 1;
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (target < nums[i]) {
                flag=1;
                break;
            }
            if (target == nums[i]) {
                index = i;
                flag = 1;
                break;
            }
            else if(target == nums[i+1]){
                index=i+1;
                flag=1;
                break;
            }else if (target > nums[i] && target < nums[i + 1]) {
                flag = 1;
                index = i + 1;
                break;
            }else {
                index=i;
            }
        }
        if (flag == 0) {
            return index+2;
        }
        return index;
    }
}