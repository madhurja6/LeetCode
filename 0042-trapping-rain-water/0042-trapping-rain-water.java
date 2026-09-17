class Solution {
    public static int trap(int[] height) {
        int i=0,hei=0,l=height[i];
        int j=height.length-1,r=height[j];
        while(i<j){
            if (l<=r){
                hei=hei+l-height[i];
                i++;
                l=Math.max(l,height[i]);
            } else {
                hei=hei+r-height[j];
                j--;
                r=Math.max(r,height[j]);
            }
        }
        return hei;
    }
}