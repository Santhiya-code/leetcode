class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]<min){
                min=arr[i+1]-arr[i];
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                ArrayList<Integer> l1=new ArrayList<>();
                l1.add(arr[i]);
                l1.add(arr[i+1]);
                 res.add(l1);
            }
        }
        return res; 
    }
}