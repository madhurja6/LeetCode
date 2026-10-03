class Solution {
    public List<String> buildArray(int[] target, int n) {
        int start = 1;
        List<String> list = new ArrayList<>();
        int m = target.length;
        for (int i = 0; i < m; i++) {
            if (start == target[i]) {
                list.add("Push");
            } else {
                list.add("Push");
                list.add("Pop");
                i--;
            }
            start++;
        }
        return list;
    }
}