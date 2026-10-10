class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set =new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!set.contains(grid[i][j])) set.add(grid[i][j]);
                else list.add(grid[i][j]);
            }
        }
        int a=1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!set.contains(a)) list.add(a);
                a++;
            }
        }
        int []x= new int[list.size()];
        for (int i = 0; i < x.length; i++) {
            x[i]= list.get(i);
        }
        return x;
    }
}