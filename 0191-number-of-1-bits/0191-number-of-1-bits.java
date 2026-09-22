class Solution {
    public static int hammingWeight(int n) {
        int num1=0;
        while(n!=0){
            if(n % 2!=0){
                num1++;
            }
            n=n/2;
        }
        return num1;
    }
}