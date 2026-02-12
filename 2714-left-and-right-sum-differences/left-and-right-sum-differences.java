class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] resl=new int[nums.length];
        int[] resr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int temp=sum;
        for(int i=nums.length-1;i>=0;i--){
             resl[i]=temp-nums[i];
             temp=resl[i];
        }
        int temp1=sum;
        for(int i=0;i<nums.length;i++){
            resr[i]=temp1-nums[i];
            temp1=resr[i];
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(resl[i]-resr[i]);
        }
        return res;
    }
}