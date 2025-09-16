class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        Stack<Character> sb=new Stack<>();
        char[] ch=s.toCharArray();
        char[] ch1=t.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='#' && !st.isEmpty()){
                  st.pop();
            }
            else if(ch[i]!='#'){
                st.push(ch[i]);
            }
        }
         for(int i=0;i<ch1.length;i++){
            if(ch1[i]=='#' && !sb.isEmpty()){
                  sb.pop();
            }
            else if(ch1[i]!='#'){
                sb.push(ch1[i]);
            }
        }
        if(st.equals(sb)){
            return true;
        }
        return false;
    }
}