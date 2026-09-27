class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop", second = "asdfghjkl", third = "zxcvbnm";
        ArrayList<String> res = new ArrayList<>();

        for (String s : words) {
            String s1 = s.toLowerCase();

            if (first.contains(s1.substring(0, 1))) {
                if (check(s1, first))
                    res.add(s);
            } else if (second.contains(s1.substring(0, 1))) {
                if (check(s1, second))
                    res.add(s);
            } else {
                if (check(s1, third))
                    res.add(s);
            }
        }

        return res.toArray(new String[0]);
    }

    private boolean check(String s, String str) {
        for (int i = 1; i < s.length(); i++) {
            if (!str.contains(s.substring(i, i + 1)))
                return false;
        }
        return true;
    }

}