class Solution {
    public static int addDigits(int num) {
        if (num/10==0) return num;
        int sum=sumofdig(num);
        while (sum/10 !=0) {
             sum = sumofdig(sum);
        }
        return sum;
    }

    private static int sumofdig(int n){
        if (n==0){
            return 0;
        }
        return n%10+sumofdig(n/10);
    }
}