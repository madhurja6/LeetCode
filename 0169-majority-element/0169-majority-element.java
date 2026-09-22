class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }
            else map.put(nums[i],1);
        }
        int max=0;
        Iterator<Integer> i=map.values().iterator();
        while (i.hasNext()){
            max=Math.max(max,i.next());
        }
        int ans=Integer.MAX_VALUE;
        Iterator<Integer> a=map.keySet().iterator();
        while (a.hasNext()){
            int key=a.next();
            if (map.get(key)==max) ans=key;
        }
        return ans;
    }
}