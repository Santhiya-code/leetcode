class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int k=nums[i+1];
            int m=1;
            while(m<=nums[i]){
                res.add(k);
                m++;
            }
        }
        int[] mm=new int[res.size()];
        for(int i=0;i<res.size();i++){
            mm[i]=res.get(i);
        }
        return mm;
    }
}