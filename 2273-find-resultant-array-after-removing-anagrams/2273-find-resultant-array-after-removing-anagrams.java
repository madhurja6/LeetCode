class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int a[] = new int[26];
            for (int j = 0; j < s.length(); j++) {
                a[s.charAt(j) - 'a']++;
            }
            list.add(words[i]);
            for (int j = i + 1; j < words.length && j < i + 2; j++) {
                String s1 = words[j];
                int b[] = new int[26];
                for (int k = 0; k < s1.length(); k++) {
                    b[s1.charAt(k) - 'a']++;
                }
                if (Arrays.equals(a, b)) {
                    i = j;
                }
            }
        }

        return list;
    }
}