class Solution {
    public static void setZeroes(int[][] matrix) {
        HashMap<Integer,Integer> mapi=new HashMap<>();
        HashMap<Integer,Integer> mapj=new HashMap<>();
        int i=0;
        for (int a=0;a< matrix.length;a++){
            for (int b=0;b< matrix[0].length;b++){
                if(matrix[a][b]==0) {
                    mapi.put(i,a);
                    mapj.put(i++,b);
                }
            }
        }
        for (int j=0;j<i;j++){
            int a1=mapi.get(j);
            int b1=mapj.get(j);
            for (int a=0;a< matrix.length;a++){
                for (int b=0;b< matrix[0].length;b++){
                    if (a==a1) matrix[a][b]=0;
                    if (b==b1) matrix[a][b]=0;
                }
            }
        }
    }
}