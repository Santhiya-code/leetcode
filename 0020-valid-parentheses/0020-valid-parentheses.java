class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
                st.push(ch[i]);
            }
            else if(ch[i]==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(ch[i]==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            } 
            else if(ch[i]=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            } 
            else{
                return false;
            }
            }
            if(st.isEmpty()){
                return true;
            }
        
            return false;

        }
}
