class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max= nums.length/3;
        for (Map.Entry<Integer,Integer> i: map.entrySet()){
            if (i.getValue()>max) list.add(i.getKey());
        }
        return list;
    }
}