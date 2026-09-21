class Solution {
    public int maxProfit(int[] prices) {
        int maxval=0,buyval=Integer.MAX_VALUE;
        for(int i:prices){
            if(i<buyval) buyval=i;
            maxval=Math.max(maxval,i-buyval);
        }
        return maxval;
    }
}