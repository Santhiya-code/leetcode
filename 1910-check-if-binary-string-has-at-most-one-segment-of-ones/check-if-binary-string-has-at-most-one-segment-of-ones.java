class Solution {
    public boolean checkOnesSegment(String s) {
        int co=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                co++;
            }
        }
        if(co==1){
            return true;
        }
        char[] ch=s.toCharArray();
        int co1=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                co1++;
            }
             if(ch[i]=='0' && co1!=0){
                  if(co1<co){
                    return false;
                  }
             }
            }
        return true;
    }
}