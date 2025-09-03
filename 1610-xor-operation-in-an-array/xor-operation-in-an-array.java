class Solution {
    public int xorOperation(int n, int start) {
        int[] arr=new int[n];
        int j=0;
        int i=1;
        int m=start;
        int r=0;
        while(i<=n){
          arr[j]=m;
          j++;
          m=m+2;
          i++;
        }
        for(int k=0;k<n;k++){
            r=r^arr[k];
        }
        // for(int k=0;k<n;k++){
        //     System.out.print(arr[k]+" ");
        // }
        return r;
    }
}