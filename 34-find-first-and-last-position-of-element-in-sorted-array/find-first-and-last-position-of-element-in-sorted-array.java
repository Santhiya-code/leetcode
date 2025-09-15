class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        boolean fou=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                 fou=true;
                break;
            }
        }
            if(!fou){
               res[0]=-1;
               res[1]=-1;
            }
            else{
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                res[1]=i;
                break;
            }
        }
            }
            return res;
    }
}