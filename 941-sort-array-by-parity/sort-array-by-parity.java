class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        ArrayList<Integer>  arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
              if(nums[i]%2==0){
                arr.add(nums[i]);
              }
              else{
                arr1.add(nums[i]);
              }
        }
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        int j=arr.size();
        for(int i=0;i<arr1.size();i++){
            res[j]=arr1.get(i);
            j++;
        }
        return res;
    }

}