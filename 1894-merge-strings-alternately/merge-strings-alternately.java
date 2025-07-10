class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        char[] ch=word1.toCharArray();
        char[]  ch2=word2.toCharArray();
        if(ch.length<ch2.length){
            for(int i=0;i<ch.length;i++){
                sb.append(ch[i]);
                sb.append(ch2[i]);
            }
            for(int i=ch.length;i<ch2.length;i++){
                sb.append(ch2[i]);
            }
        }
         if(ch2.length<ch.length){
            for(int i=0;i<ch2.length;i++){
                sb.append(ch[i]);
                sb.append(ch2[i]);
            }
            for(int i=ch2.length;i<ch.length;i++){
                sb.append(ch[i]);
            }
        }
        if(ch.length==ch2.length){
            for(int i=0;i<ch.length;i++){
                sb.append(ch[i]);
                sb.append(ch2[i]);
            }
        }
            
       
        return sb.toString();
    }
}
    
