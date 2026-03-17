class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>();
        if(nums.length<=1){
            arr.add(nums[0]);
            return arr;
        }
        if(nums[0]+1 !=nums[1] && nums[0]!=nums[1]){
            arr.add(nums[0]);
        }
        if(nums[nums.length-1]-1 !=nums[nums.length-2] && nums[nums.length-1]!=nums[nums.length-2]){
            arr.add(nums[nums.length-1]);
        }
        for(int i=1;i<nums.length-1;i++){
            if((nums[i]-1)!=nums[i-1]&& (nums[i]+1)!=nums[i+1] && nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                        arr.add(nums[i]);
            }
        }
        return arr;
    }
}