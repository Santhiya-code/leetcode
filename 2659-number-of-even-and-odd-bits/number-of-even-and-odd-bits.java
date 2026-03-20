class Solution {
    public int[] evenOddBit(int n) {
      String str=Integer.toBinaryString(n);
      System.out.print(str);
      int ev=0;
      int od=0;
      int i=0;
      for(int j=str.length()-1;j>=0;j--){
        char ch=str.charAt(j);
         if(ch=='1'){
            if(i%2==0){
                ev++;
            }
            else{
                od++;
            }
         }
         i++;
      }
      int[] res=new int[2];
      res[0]=ev;
      res[1]=od;
      return res;
    }
}