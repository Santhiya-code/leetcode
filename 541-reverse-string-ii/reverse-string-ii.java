class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i+=k){
          StringBuilder sb=new StringBuilder();
          for(int j=i;j<i+k && j<s.length();j++){
            char ch=s.charAt(j);
            sb.append(ch);
            System.out.print(ch);
          }
          if(c%2==0){
            sb.reverse();
            res.append(sb);
          }
          else{
            res.append(sb);
          }
          c++;
          sb.setLength(0);
        }
        return res.toString();
    }
}