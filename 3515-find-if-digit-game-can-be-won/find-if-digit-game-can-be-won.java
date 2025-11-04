class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
               int temp=nums[i];
               int co=0;
               while(temp!=0){
                int dig=temp%10;
                 co++;
                 temp=temp/10;
               }
               if(co>=2){
                sum2+=nums[i];
               }
               else{
                sum1+=nums[i];
               }
        }
        if(sum1==sum2){
            return false;
        }
        return true;
    }
}