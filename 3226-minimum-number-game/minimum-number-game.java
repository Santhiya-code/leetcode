class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length-1;i+=2){
              res[j]=nums[i+1];
              j++;
              res[j]=nums[i];
              j++;
        }
        return res;
    }
}