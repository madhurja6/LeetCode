class Solution {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            singleAdd(i, list);
        }
        int[] x = new int[list.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = list.get(i);
        }
        return x;
    }

    private static void singleAdd(int i, ArrayList<Integer> list) {
        if (i == 0)
            return;
        singleAdd(i / 10, list);
        list.add(i % 10);
    }
}