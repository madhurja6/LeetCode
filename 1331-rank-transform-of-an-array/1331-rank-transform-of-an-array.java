class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length==0) return arr;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] x = new int[arr.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = arr[i];
        }
        Arrays.sort(x);
        int a = 1;
        for (int i = 0; i < x.length; i++) {
            if (!map.containsKey(x[i])) map.put(x[i], a++);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}