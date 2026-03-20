class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Set<Integer> prev=new HashSet<>();
            Set<Integer> next=new HashSet<>();
            for(int k=0;k<=i;k++){
                 prev.add(nums[k]);
            }
            for(int j=i+1;j<nums.length;j++){
                 next.add(nums[j]);
            }
            res[i]=prev.size()-next.size();
            // prev.clear();
            // next.clear();
        }
    return res;
    }
}