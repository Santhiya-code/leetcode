class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums[nums.length-1];
        int sum=0;
        while(i<k){
         sum+=j;
         j++;
         i++;
        }
        return sum;
    }
}