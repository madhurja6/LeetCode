class Solution {
    public int subtractProductAndSum(int n) {
        return product(n)-sum(n);
    }
    private static int sum(int n){
        if(n==0) return 0;
        return n%10 + sum(n/10);
    }
    private static int product(int n){
        if(n==0) return 1;
        return n%10 * product(n/10);
    }
}