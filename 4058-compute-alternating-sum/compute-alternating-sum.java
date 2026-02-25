class Solution {
    public int alternatingSum(int[] nums) {
        int res=0;
        if(nums.length<=1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
              res-=nums[i];
            }
            else{
                res+=nums[i];
            }
        }
        return res;
    }
}