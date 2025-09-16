class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for(String ch:tokens){
            if(isOperator(ch)){
             int num2=Integer.parseInt(st.pop());
             int num1=Integer.parseInt(st.pop());
             int res=0;
             if(ch.equals("+")){
                res=num1+num2;
             }
             else if(ch.equals("-")){
                res=num1-num2;
             }
             else if(ch.equals("*")){
                res=num1*num2;
             }
             else if(ch.equals("/")){
                res=num1/num2;
             }
             st.push(Integer.toString(res));
            }
            else{
                st.push(ch);
            }
        }
        return Integer.parseInt(st.peek());
    }
        public boolean isOperator(String str){
          if(str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*")){
                return true;
            }
            return false;
        }
}