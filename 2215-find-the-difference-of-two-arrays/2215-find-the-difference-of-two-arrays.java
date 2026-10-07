class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list =new ArrayList<>();
        ArrayList<Integer> n1=new ArrayList<>();
        ArrayList<Integer> n2=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums1){
            set.add(i);
        }
        for (int i:nums2) {
           if (!set.contains(i) && !n2.contains(i)) n2.add(i);
        }
        set.clear();
        for (int i:nums2){
            set.add(i);
        }
        for (int i:nums1) {
            if (!set.contains(i) && !n1.contains(i)) n1.add(i);
        }
        list.add(n1);
        list.add(n2);
        return list;
    }
}