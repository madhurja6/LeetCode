class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i) - 96;
            sum=sum+sumofdig(a);
        }
        if(k==1) return sum;
        else{
            int tran=0;
            for(int i=1;i<k;i++){
                tran=sumofdig(sum);
                sum=tran;
            }
            return tran;
        }
    }
    public static int sumofdig(int n){
        if (n==0) return 0;
        return n%10+sumofdig(n/10);
    }
}