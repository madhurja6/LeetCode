class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        int[] set = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (set[i] == 0) {
                int arr[] = new int[26];
                for (int k = 0; k < strs[i].length(); k++) {
                    arr[strs[i].charAt(k) - 'a']++;
                }
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (set[j] == 0) {
                        int brr[] = new int[26];
                        for (int k = 0; k < strs[j].length(); k++) {
                            brr[strs[j].charAt(k) - 'a']++;
                        }
                        if (Arrays.equals(arr, brr)) {
                            l.add(strs[j]);
                            set[j]++;
                        }
                    }
                }
                list.add(l);
            }
        }
        return list;
    }
}