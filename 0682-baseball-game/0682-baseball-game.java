class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String sb:operations){
           
            if(sb.equals("C")){
                st.pop();
            }
            else if(sb.equals("D")){
                int so=st.peek();
                int rem=so*2;
                st.push(rem);
            }
            else if(sb.equals("+")){
                int mm=st.peek();
                int fi=st.pop();
                int nn=st.peek();
                int ro=mm+nn;
                st.push(fi);
                st.push(ro);
            }
            else{
                int num=Integer.parseInt(sb);
                st.push(num);
            }

        }
        int res=0;
        for(int rm:st){
            res=res+rm;
        }
        return res;
    }
}