class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=s.toCharArray();
        for(int i=0;i<indices.length;i++){
            int mm=indices[i];
            ch[mm]=s.charAt(i);
        }
        String res=new String(ch);
        return res;
    }
}