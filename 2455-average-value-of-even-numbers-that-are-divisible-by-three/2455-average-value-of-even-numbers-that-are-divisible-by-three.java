class Solution {
    public int averageValue(int[] nums) {
        int sum=0,c=0;
        for(int i:nums){
            if(i%6==0){
                sum+=i;
                c++;
            }
        }
        if(c==0) return c;
        return sum/c;
    }
}