class Solution {
    public String largestNumber(int[] nums) {
        String[] num = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                String a = num[i] + num[j];
                String b = num[j] + num[i];
                if (a.compareTo(b) < 0) {
                    String t = num[i];
                    num[i] = num[j];
                    num[j] = t;
                }
            }
        }
        if (num[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String s : num) {
            sb.append(s);
        }
        return sb.toString();
    }
}