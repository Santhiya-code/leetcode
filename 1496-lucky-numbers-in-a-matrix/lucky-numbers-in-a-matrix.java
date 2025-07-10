class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l1=new ArrayList<>();
        int min=0;
        int max=0;
        for(int i=0;i<matrix.length;i++){
            min=Integer.MAX_VALUE;
            int n=0;
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]<min){
                    min=matrix[i][j];
                    n=j;
                 }
            }
            max=Integer.MIN_VALUE;
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][n]>max){
                max=matrix[j][n];
            }
        }
        if(min==max){
            l1.add(min);
        }
        }
         return l1;
    }
}