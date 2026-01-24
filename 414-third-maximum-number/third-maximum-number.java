class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int res=0;
        int i=0;
        int[] mm=new int[set.size()];
        for(int arr:set){
            mm[i]=arr;
            i++;
        }
        if(mm.length<3){
            return mm[mm.length-1];
        }
        res=mm[mm.length-3];
        return res;
    }
}