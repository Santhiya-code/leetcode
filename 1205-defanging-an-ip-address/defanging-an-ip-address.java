class Solution {
    public String defangIPaddr(String address) {
        char[] ch=address.toCharArray();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ch.length;i++){
           if(ch[i]=='.'){
            res.append("[");
            res.append(".");
            res.append("]");
           }
           else{
            res.append(ch[i]);
           }
        }
        String sb=res.toString();
        return sb;
    }
}