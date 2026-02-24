class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length+nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            res[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            res[k]=nums[i];
            k++;
        }
        return res;
    }
}