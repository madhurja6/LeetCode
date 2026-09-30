class Solution {
    public int heightChecker(int[] heights) {
         int len=heights.length;
        int []x=new int[len];
        for (int i=0;i<len;i++){
            x[i]=heights[i];
        }
        Arrays.sort(x);
        int count=0;
        for (int i=0;i<len;i++){
            if (x[i]!=heights[i]) count++;
        }
        return count;
    }
}