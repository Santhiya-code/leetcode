class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int[] mm=new int[nums.length];
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int j=n;j<nums.length;j++){
            res.add(nums[j]);
        }
        int k=0;
        for(int i=0;i<nums.length;i+=2){
           mm[i]=arr.get(k);
           mm[i+1]=res.get(k);
           k++;
        }
        return mm;

    }
}