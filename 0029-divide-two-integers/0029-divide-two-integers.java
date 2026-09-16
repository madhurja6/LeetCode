class Solution {
    public static int divide(int dividend, int divisor) {
        int f=0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == Integer.MIN_VALUE){
            return 1;
        }
        if(divisor < 0 || dividend < 0){
            divisor=divisor*(-1);
            f=1;
        }
        int result=dividend/divisor;

        if(f==1){
            result=result*(-1);
        }
            return result;
    }
}