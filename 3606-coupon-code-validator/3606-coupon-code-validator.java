class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (!isActive[i])
                continue;
            if (!priority.containsKey(businessLine[i]))
                continue;
            if (code[i] == null || code[i].isEmpty())
                continue;
            boolean validCode = true;
            for (char c : code[i].toCharArray()) {
                if (!(Character.isLetterOrDigit(c) || c == '_')) {
                    validCode = false;
                    break;
                }
            }
            if (validCode) {
                valid.add(new String[] { businessLine[i], code[i] });
            }
        }
        valid.sort((a, b) -> {
            int cmp = priority.get(a[0]) - priority.get(b[0]);
            if (cmp != 0)
                return cmp;
            return a[1].compareTo(b[1]);
        });
        List<String> result = new ArrayList<>();
        for (String[] v : valid) {
            result.add(v[1]);
        }

        return result;
    }

}