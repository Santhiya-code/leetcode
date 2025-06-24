class Solution {
    public String simplifyPath(String path) {
         String[] arr=path.split("/");
         Stack<String> st=new Stack<>();
         for(String sb:arr){
            if(sb.equals(".")|| sb.equals("")){
                continue;
            }
            else if(sb.equals("..")){
                if(!st.isEmpty()){
                st.pop();
                }
            }
            else{
                st.push(sb);
            }
         }
         StringBuilder rr=new StringBuilder();
         for(String ss:st){
            rr.append("/");
            rr.append(ss);
         }
         if(rr.length()==0){
            return "/";
         }
         return rr.toString();
    }
}