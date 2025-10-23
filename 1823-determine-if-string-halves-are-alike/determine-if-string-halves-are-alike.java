class Solution {
    public boolean halvesAreAlike(String s) {
        char[] ch=s.toCharArray();
        int co=0;
        int coo=0;
        for(int i=0;i<ch.length/2;i++){
           if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ){
            co++;
           }
        }
        for(int i=ch.length/2;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ){
               coo++;
           }
        }
        if(co==coo){
            return true;
        }
        return false;
    }
}