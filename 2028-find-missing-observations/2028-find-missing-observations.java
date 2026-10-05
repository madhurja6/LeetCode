class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int i:rolls){
            sum+=i;
        }
        int remain=mean * (n+rolls.length) -sum;
        if(remain > 6*n || remain <n) return new int[0];
        int d=remain / n;
        int mod=remain % n;
        int []x=new int[n];
        Arrays.fill(x,d);
        for(int i=0;i<mod;i++){
            x[i]++;
        }
        return x;
    }
}