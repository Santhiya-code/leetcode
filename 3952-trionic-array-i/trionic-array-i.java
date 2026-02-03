class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int q=0;
         boolean val1=false;
         boolean val2=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i] && !val1){
                p=i;
                val1=true;
            }
            else if(nums[i+1]>nums[i] && val1 &&!val2){
                q=i;
                val2=true;
            }
        }
        if(!val1 ||!val2){
            return false;
        }
        if(p == 0 || q <= p || q == nums.length - 1) return false;
        else{
            for(int i=0;i<p;i++){
                if(nums[i]>=nums[i+1]){
                    return false;
                }
            }
            for(int i=p;i<q;i++){
                if(nums[i]<=nums[i+1]){
                    return false;
                }
            }
            for(int i=q;i<nums.length-1;i++){
               if(nums[i]>=nums[i+1]){
                return false;
               }
            }
        }
        System.out.print(p+" "+q);
        return true;
    }
}