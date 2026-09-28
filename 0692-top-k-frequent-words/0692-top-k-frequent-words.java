class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    HashMap<String, Integer> map = new HashMap<>();
    for (String s : words) {
        map.put(s, map.getOrDefault(s, 0) + 1);
    }
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a, b) -> {
        int freqCompare = b.getValue().compareTo(a.getValue()); 
        if (freqCompare == 0) {
            return a.getKey().compareTo(b.getKey());
        }
        return freqCompare;
    });
    List<String> ans = new ArrayList<>();
    for (int i = 0; i < k && i < list.size(); i++) {
        ans.add(list.get(i).getKey());
    }
    return ans;
}

}