class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             if(nums[i]%2==0 && nums[i]%3==0){
                arr.add(nums[i]);
             }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        if(arr.size()==0){
            return 0;
        }
        int k=sum/arr.size();
        return k;
    }
}