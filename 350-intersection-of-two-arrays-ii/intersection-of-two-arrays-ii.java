class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
         for(int i=0;i<nums2.length;i++){
            map1.put(nums2[i],map1.getOrDefault(nums2[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map1.containsKey(key)){
                int min=Math.min(map1.get(key),map.get(key));
                int i=1;
                while(i<=min){
                    ans.add(key);
                    i++;
                }
            }
        }
        int[] mm=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            mm[i]=ans.get(i);
        }
        return mm;
    }
}