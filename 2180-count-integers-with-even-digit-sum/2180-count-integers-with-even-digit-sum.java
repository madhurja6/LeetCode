class Solution {
    public static int countEven(int num) {
        int count=0;
        for (int i=1;i<=num;i++){
            if (sumofDigit(i) % 2==0){
                count++;
            }
        }
        return count;
    }
    private static int sumofDigit(int n){
        if(n==0){
            return n;
        }else
        return (n%10)+sumofDigit(n/10);
    }
}