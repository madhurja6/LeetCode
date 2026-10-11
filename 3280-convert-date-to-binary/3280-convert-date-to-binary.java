class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String year = Integer.toBinaryString(Integer.parseInt(date.substring(0, 4)));
        String month = Integer.toBinaryString(Integer.parseInt(date.substring(5, 7)));
        String day = Integer.toBinaryString(Integer.parseInt(date.substring(8)));
        sb.append(year);
        sb.append("-");
        sb.append(month);
        sb.append("-");
        sb.append(day);
        return sb.toString();
    }
}