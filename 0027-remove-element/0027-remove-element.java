class Solution {

    public int removeElement(int[] nums, int val) {

        int i = 0;

        for (int j = 0; j <= nums.length-1; j++) {

            if (nums[j] != val) {

                int temp = nums[i];

                nums[i] = nums[j];

                nums[j] = temp;

                i++;

            }

        }

        return i;

    }

}

        

