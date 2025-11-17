class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             if(nums[i]==1){
                res.add(i);
             }
        }
        for(int i=1;i<res.size();i++){
            int s=Math.abs(res.get(i)-res.get(i-1))-1;
                if(s<k){
                    return false;
                   }
           }
        return true;
    }
}