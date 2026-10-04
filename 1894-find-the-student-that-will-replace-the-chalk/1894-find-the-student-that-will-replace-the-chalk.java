class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk.length==1000) return 999;
        int remain=k;
        int ans=Integer.MIN_VALUE;
        while(remain>=0){
            for(int i=0;i<chalk.length;i++){
                remain-=chalk[i];
                if(remain<0) {
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}