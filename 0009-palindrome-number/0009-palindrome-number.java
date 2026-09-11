class Solution {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if (x==palin(x)){
            return true;
        }else{
            return false;
        }
    }
    private static int palin(int n) {
        if (n == 0) {
            return n;
        }
        int dig = digit(n);
        return n % 10 * (int) Math.pow(10, dig-1) + palin(n / 10);
    }

    private static int digit(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + digit(n / 10);
    }
}