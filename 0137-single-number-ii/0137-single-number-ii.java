class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            if (!map.containsKey(i)) map.put(i,1);
            else map.replace(i,map.get(i)+1);
        }
        for (int i:nums) {
            if (map.get(i) == 1) return i;
        }
        return -1;
    }
}