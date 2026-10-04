class Solution {
    public int arraySign(int[] nums) {
        int countnagative=0;
        for(int i:nums){
            if(i==0) return 0;
            if(i<0) countnagative++;
        }
        if(countnagative % 2 == 0) return 1;
        else return -1;
    }
}