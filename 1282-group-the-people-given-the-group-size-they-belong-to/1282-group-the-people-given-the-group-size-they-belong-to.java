class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> main = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int key = groupSizes[i];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);
            if (map.get(key).size() == key) {
                main.add(map.get(key));
                map.put(key, new ArrayList<>());
            }
        }
        return main;
    }
}