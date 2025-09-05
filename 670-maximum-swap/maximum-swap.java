class Solution {
    public int maximumSwap(int num) {
       String str=String.valueOf(num);
       char[] ch=str.toCharArray();
       for(int i=0;i<ch.length;i++){
        boolean fou=false;
        int r=0;
         char max=ch[i];
         for(int j=i+1;j<ch.length;j++){
             if(ch[j]>=max  && ch[i]!=ch[j]){
                     fou=true;
                     max=ch[j];
                     r=j;
            }
         }
         if(fou){
            char temp=ch[i];
            ch[i]=ch[r];
            ch[r]=temp;
             break;
         }
       }
       String h="";
       for(int i=0;i<ch.length;i++){
        h+=ch[i];
       }
       int b=Integer.parseInt(h);
       return b;
    }
}