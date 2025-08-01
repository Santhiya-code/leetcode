class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> arr=new ArrayList<>();
         List<Integer> mm=new ArrayList<>();
         if(rowIndex==0){
            mm.add(1);
            return mm;
         }
        for(int i=0;i<=rowIndex;i++){
            List<Integer> res=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    res.add(1);
                }
                else{
                    int k=arr.get(i-1).get(j-1);
                    int m=arr.get(i-1).get(j);
                    int r=k+m;
                    res.add(r);
                }
            }
            arr.add(res);
        }
        return arr.get(rowIndex);
    }
}